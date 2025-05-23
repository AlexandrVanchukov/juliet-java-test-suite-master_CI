
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

package juliet.testcases.CWE89_SQL_Injection.s03;

import juliet.support.AbstractTestCase;
import juliet.support.IO;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java juliet.support.Main juliet.testcases.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference.custom_function.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference__custom_function_01 juliet.testcases.CWE481_Assigning_instead_of_Comparing.bool.CWE481_Assigning_instead_of_Comparing__bool_01");
				System.exit(1);
			}
			
			/* User supplied some class names on the command line, just use those with introspection
			 *
			 * String classNames[] = { "CWE481_Assigning_instead_of_Comparing__boolean_01",
			 *		"CWE476_Null_Pointer_Dereference__getProperty_01" };
 			 * could read class names from command line or use
			 * http://sadun-util.sourceforge.net/api/org/sadun/util/
			 * ClassPackageExplorer.html
			 */

			for (String className : args) {

				try {
					
					/* String classNameWithPackage = "testcases." + className; */
					
					/* IO.writeLine("classNameWithPackage = " + classNameWithPackage); */

					Class<?> myClass = Class.forName(className);

					AbstractTestCase myObject = (AbstractTestCase) myClass
							.newInstance();

					myObject.runTest(className);

				} catch (Exception ex) {

					IO.writeLine("Could not run test for class " + className);
					ex.printStackTrace();

				}
				
				IO.writeLine(""); /* leave a blank line between classes */

			}

		} else {
		
			/* No command line args were used, we want to run every testcase */
			
			/* needed to separate these calls into other methods because
			   we were running into the size limit Java has for a single method */
			runTestCWE1();
			runTestCWE2();
			runTestCWE3();
			runTestCWE4();
			runTestCWE5();
			runTestCWE6();
			runTestCWE7();
			runTestCWE8();
			runTestCWE9();
		}			
	}

private static void runTestCWE1() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-1 */

			/* END-AUTOGENERATED-JAVA-TESTS-1 */
}

private static void runTestCWE2() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-2 */

			/* END-AUTOGENERATED-JAVA-TESTS-2 */
}

private static void runTestCWE3() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-3 */

			/* END-AUTOGENERATED-JAVA-TESTS-3 */
}

private static void runTestCWE4() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-4 */

			/* END-AUTOGENERATED-JAVA-TESTS-4 */
}

private static void runTestCWE5() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-5 */

			/* END-AUTOGENERATED-JAVA-TESTS-5 */
}

private static void runTestCWE6() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-6 */

			/* END-AUTOGENERATED-JAVA-TESTS-6 */
}

private static void runTestCWE7() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-7 */

			/* END-AUTOGENERATED-JAVA-TESTS-7 */
}

private static void runTestCWE8() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-8 */
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_01()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_01");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_02()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_02");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_03()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_03");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_04()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_04");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_05()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_05");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_06()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_06");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_07()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_07");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_08()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_08");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_09()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_09");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__listen_tcp_executeBatch_10()).runTest("CWE89_SQL_Injection__listen_tcp_executeBatch_10");
			
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_01()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_01");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_02()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_02");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_03()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_03");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_04()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_04");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_05()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_05");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_06()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_06");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_07()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_07");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_08()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_08");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_09()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_09");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeBatch_10()).runTest("CWE89_SQL_Injection__PropertiesFile_executeBatch_10");
			
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_01()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_01");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_02()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_02");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_03()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_03");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_04()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_04");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_05()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_05");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_06()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_06");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_07()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_07");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_08()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_08");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_09()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_09");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeQuery_10()).runTest("CWE89_SQL_Injection__PropertiesFile_executeQuery_10");
			
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_01()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_01");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_02()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_02");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_03()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_03");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_04()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_04");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_05()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_05");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_06()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_06");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_07()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_07");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_08()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_08");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_09()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_09");
			(new juliet.testcases.CWE89_SQL_Injection.s03.CWE89_SQL_Injection__PropertiesFile_executeUpdate_10()).runTest("CWE89_SQL_Injection__PropertiesFile_executeUpdate_10");
			
			/* END-AUTOGENERATED-JAVA-TESTS-8 */
}

private static void runTestCWE9() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

			/* END-AUTOGENERATED-JAVA-TESTS-9 */
}
}