
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE321_Hard_Coded_Cryptographic_Key__basic_81_goodG2B.java
Label Definition File: CWE321_Hard_Coded_Cryptographic_Key__basic.label.xml
Template File: sources-sink-81_goodG2B.tmpl.java
*/
/*
 * @description
 * CWE: 321 Hard coded crypto key
 * BadSource:  Set data to a hardcoded value
 * GoodSource: Read data from the console using readLine()
 * Sinks:
 *    BadSink : Use data as a cryptographic key
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE321_Hard_Coded_Cryptographic_Key;

import juliet.support.*;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

public class CWE321_Hard_Coded_Cryptographic_Key__basic_81_goodG2B extends CWE321_Hard_Coded_Cryptographic_Key__basic_81_base
{
    public void action(String data ) throws Throwable
    {

        if (data != null)
        {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            /* POTENTIAL FLAW: Use data as a cryptographic key */
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
        }

    }
}
