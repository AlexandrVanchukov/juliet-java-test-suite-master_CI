
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE338_Weak_PRNG__math_16.java
Label Definition File: CWE338_Weak_PRNG.label.xml
Template File: point-flaw-16.tmpl.java
*/
/*
* @description
* CWE: 338 Use of Cryptographically Weak PRNG
* Sinks: math
*    GoodSink: stronger PRNG
*    BadSink : weak PRNG
* Flow Variant: 16 Control flow: while(true)
*
* */

package juliet.testcases.CWE338_Weak_PRNG;

import juliet.support.*;

import java.security.SecureRandom;

public class CWE338_Weak_PRNG__math_16 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        while(true)
        {
            /* FLAW: Math.random() is a known weak PRNG */
            IO.writeLine("" + Math.random());
            break;
        }
    }

    /* good1() change the conditions on the while statements */
    private void good1() throws Throwable
    {
        while(true)
        {
            /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
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
