
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_61b.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-61b.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * Sinks: addHeaderServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to addHeader()
 * Flow Variant: 61 Data flow: data returned from one method to another in different classes in the same package
 *
 * */

package juliet.testcases.CWE113_HTTP_Response_Splitting.s03;
import juliet.support.*;

import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import java.util.logging.Level;

public class CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_61b
{
    public String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = ""; /* Initialize data */

        /* read input from URLConnection */
        {
            URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;

            try
            {
                readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                /* POTENTIAL FLAW: Read data from a web server with URLConnection */
                /* This will be reading the first "line" of the response body,
                 * which could be very long if there are no newlines in the HTML */
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }

        return data;
    }

    /* goodG2B() - use goodsource and badsink */
    public String goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        return data;
    }

    /* goodB2G() - use badsource and goodsink */
    public String goodB2GSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = ""; /* Initialize data */

        /* read input from URLConnection */
        {
            URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;

            try
            {
                readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                /* POTENTIAL FLAW: Read data from a web server with URLConnection */
                /* This will be reading the first "line" of the response body,
                 * which could be very long if there are no newlines in the HTML */
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }

        return data;
    }
}
