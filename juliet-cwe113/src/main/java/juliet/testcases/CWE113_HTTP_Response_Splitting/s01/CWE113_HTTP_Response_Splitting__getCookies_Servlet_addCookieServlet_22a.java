
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22a.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-22a.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded string
 * Sinks: addCookieServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to addCookie()
 * Flow Variant: 22 Control flow: Flow controlled by value of a public static variable. Sink functions are in a separate file from sources.
 *
 * */

package juliet.testcases.CWE113_HTTP_Response_Splitting.s01;
import juliet.support.*;

import javax.servlet.http.*;


public class CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22a extends AbstractTestCaseServlet
{
    /* The public static variable below is used to drive control flow in the sink function.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean badPublicStatic = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        data = ""; /* initialize data in case there are no cookies */

        /* Read data from cookies */
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                /* POTENTIAL FLAW: Read data from the first cookie value */
                data = cookieSources[0].getValue();
            }
        }

        badPublicStatic = true;
        (new CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22b()).badSink(data , request, response);
    }

    /* The public static variables below are used to drive control flow in the sink functions.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean goodB2G1PublicStatic = false;
    public static boolean goodB2G2PublicStatic = false;
    public static boolean goodG2BPublicStatic = false;

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodB2G1(request, response);
        goodB2G2(request, response);
        goodG2B(request, response);
    }

    /* goodB2G1() - use badsource and goodsink by setting the static variable to false instead of true */
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        data = ""; /* initialize data in case there are no cookies */

        /* Read data from cookies */
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                /* POTENTIAL FLAW: Read data from the first cookie value */
                data = cookieSources[0].getValue();
            }
        }

        goodB2G1PublicStatic = false;
        (new CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22b()).goodB2G1Sink(data , request, response);
    }

    /* goodB2G2() - use badsource and goodsink by reversing the blocks in the if in the sink function */
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        data = ""; /* initialize data in case there are no cookies */

        /* Read data from cookies */
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                /* POTENTIAL FLAW: Read data from the first cookie value */
                data = cookieSources[0].getValue();
            }
        }

        goodB2G2PublicStatic = true;
        (new CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22b()).goodB2G2Sink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        /* FIX: Use a hardcoded string */
        data = "foo";

        goodG2BPublicStatic = true;
        (new CWE113_HTTP_Response_Splitting__getCookies_Servlet_addCookieServlet_22b()).goodG2BSink(data , request, response);
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
