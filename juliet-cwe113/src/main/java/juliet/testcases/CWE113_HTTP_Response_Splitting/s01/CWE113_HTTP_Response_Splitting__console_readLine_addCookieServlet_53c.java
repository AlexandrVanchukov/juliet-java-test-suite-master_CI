
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__console_readLine_addCookieServlet_53c.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-53c.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: console_readLine Read data from the console using readLine()
 * GoodSource: A hardcoded string
 * Sinks: addCookieServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to addCookie()
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE113_HTTP_Response_Splitting.s01;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE113_HTTP_Response_Splitting__console_readLine_addCookieServlet_53c
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__console_readLine_addCookieServlet_53d()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__console_readLine_addCookieServlet_53d()).goodG2BSink(data , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__console_readLine_addCookieServlet_53d()).goodB2GSink(data , request, response);
    }
}
