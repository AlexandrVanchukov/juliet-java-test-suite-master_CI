
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE614_Sensitive_Cookie_Without_Secure__Servlet_11.java
Label Definition File: CWE614_Sensitive_Cookie_Without_Secure__Servlet.label.xml
Template File: point-flaw-11.tmpl.java
*/
/*
* @description
* CWE: 614 Sensitive Cookie Without Secure
* Sinks:
*    GoodSink: secure flag set
*    BadSink : secure flag not set
* Flow Variant: 11 Control flow: if(IO.staticReturnsTrue()) and if(IO.staticReturnsFalse())
*
* */

package juliet.testcases.CWE614_Sensitive_Cookie_Without_Secure;

import juliet.support.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE614_Sensitive_Cookie_Without_Secure__Servlet_11 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                /* FLAW: secure flag not set */
                response.addCookie(cookie);
            }
        }
    }

    /* good1() changes IO.staticReturnsTrue() to IO.staticReturnsFalse() */
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                /* FIX: adds "secure" flag/attribute to cookie */
                cookie.setSecure(true);
                response.addCookie(cookie);
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                /* FIX: adds "secure" flag/attribute to cookie */
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        good1(request, response);
        good2(request, response);
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the juliet.testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
