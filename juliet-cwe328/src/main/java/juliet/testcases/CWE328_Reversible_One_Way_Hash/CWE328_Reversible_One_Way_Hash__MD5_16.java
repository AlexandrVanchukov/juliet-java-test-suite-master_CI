
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE328_Reversible_One_Way_Hash__MD5_16.java
Label Definition File: CWE328_Reversible_One_Way_Hash.label.xml
Template File: point-flaw-16.tmpl.java
*/
/*
* @description
* CWE: 328 Reversible One Way Hash
* Sinks: MD5
*    GoodSink: SHA512
*    BadSink : MD5
* Flow Variant: 16 Control flow: while(true)
*
* */

package juliet.testcases.CWE328_Reversible_One_Way_Hash;

import juliet.support.*;

import java.security.MessageDigest;

public class CWE328_Reversible_One_Way_Hash__MD5_16 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        while(true)
        {
            String input = "Test Input";
            /* FLAW: Insecure cryptographic hashing algorithm (MD5) */
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
            IO.writeLine(IO.toHex(hashValue));
            break;
        }
    }

    /* good1() change the conditions on the while statements */
    private void good1() throws Throwable
    {
        while(true)
        {
            String input = "Test Input";
            /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
            IO.writeLine(IO.toHex(hashValue));
            break;
        }
    }

    public void good() throws Throwable
    {
        good1();
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
