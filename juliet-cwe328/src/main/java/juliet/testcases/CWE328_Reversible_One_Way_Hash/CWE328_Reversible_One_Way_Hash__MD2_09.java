
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE328_Reversible_One_Way_Hash__MD2_09.java
Label Definition File: CWE328_Reversible_One_Way_Hash.label.xml
Template File: point-flaw-09.tmpl.java
*/
/*
* @description
* CWE: 328 Reversible One Way Hash
* Sinks: MD2
*    GoodSink: SHA512
*    BadSink : MD2
* Flow Variant: 09 Control flow: if(IO.STATIC_FINAL_TRUE) and if(IO.STATIC_FINAL_FALSE)
*
* */

package juliet.testcases.CWE328_Reversible_One_Way_Hash;

import juliet.support.*;

import java.security.MessageDigest;

public class CWE328_Reversible_One_Way_Hash__MD2_09 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
        {
            String input = "Test Input";
            /* FLAW: Insecure cryptographic hashing algorithm (MD2) */
            MessageDigest messageDigest = MessageDigest.getInstance("MD2");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    /* good1() changes IO.STATIC_FINAL_TRUE to IO.STATIC_FINAL_FALSE */
    private void good1() throws Throwable
    {
        if (IO.STATIC_FINAL_FALSE)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            String input = "Test Input";

            /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
        {
            String input = "Test Input";
            /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void good() throws Throwable
    {
        good1();
        good2();
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
