
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE321_Hard_Coded_Cryptographic_Key__basic_54b.java
Label Definition File: CWE321_Hard_Coded_Cryptographic_Key__basic.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 321 Hard coded crypto key
 * BadSource:  Set data to a hardcoded value
 * GoodSource: Read data from the console using readLine()
 * Sinks:
 *    BadSink : Use data as a cryptographic key
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE321_Hard_Coded_Cryptographic_Key;

import juliet.support.*;

public class CWE321_Hard_Coded_Cryptographic_Key__basic_54b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE321_Hard_Coded_Cryptographic_Key__basic_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE321_Hard_Coded_Cryptographic_Key__basic_54c()).goodG2BSink(data );
    }
}
