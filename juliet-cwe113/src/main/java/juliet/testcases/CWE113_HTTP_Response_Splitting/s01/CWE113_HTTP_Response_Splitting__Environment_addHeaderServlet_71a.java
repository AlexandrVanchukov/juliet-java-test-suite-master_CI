
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__Environment_addHeaderServlet_71a.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-71a.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded string
 * Sinks: addHeaderServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to addHeader()
 * Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
 *
 * */

package juliet.testcases.CWE113_HTTP_Response_Splitting.s01;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE113_HTTP_Response_Splitting__Environment_addHeaderServlet_71a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        data = System.getenv("ADD");

        (new CWE113_HTTP_Response_Splitting__Environment_addHeaderServlet_71b()).badSink((Object)data , request, response );
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
        goodB2G(request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        (new CWE113_HTTP_Response_Splitting__Environment_addHeaderServlet_71b()).goodG2BSink((Object)data , request, response );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        data = System.getenv("ADD");

        (new CWE113_HTTP_Response_Splitting__Environment_addHeaderServlet_71b()).goodB2GSink((Object)data , request, response );
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
