
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

/*
@description This abstract class is the base for all non-Servlet
AbstractTestCase classes.

*/

package juliet.support;

public abstract class AbstractTestCaseBase 
{
    public abstract void runTest(String className);

    /* from a static method like main(), there is not an easy way to get the current
     * classes's name.  We do a trick here to make it work so that we don't have
     * to edit the main for each test case or use a string member to contain the class
     * name
     */
    public static void mainFromParent(String[] args)
        throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        StackTraceElement stackTraceElements[] = Thread.currentThread().getStackTrace();
    
        String myClassName = stackTraceElements[stackTraceElements.length -1].getClassName();
    
        Class<?> myClass = Class.forName(myClassName);
    
        AbstractTestCaseBase myObject = (AbstractTestCaseBase) myClass.newInstance();
        
        myObject.runTest(myClassName);
    }
}
