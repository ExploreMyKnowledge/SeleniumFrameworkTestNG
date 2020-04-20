package listeners;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 * To add listener class for 1 class write the following line 
 * @Listeners(listeners.TestNGListeners.class)
 * If you want to include multiple classes then convert the class file into xml and include it under the suite
 * as demonstrated in testinglistener.xml file
 * 
 * */

public class TestNGListenerDemo2 {
	/**
	 * priority in order of priority number,excepts negative numbers as well
	 * or according to alphabetocal order of the method name.	 * 
	 * */
	@Test(priority = 1)
	public void test4() {
		System.out.println("I am inside test4");
	}
	@Test(priority = 3)
	public void test5() {
		System.out.println("I am inside test5");
		//assert.assertTrue(false);
	}
	@Test(priority = 0)
	public void test6() {
		System.out.println("I am inside test6");
		throw new SkipException("This test is skipped");
	}

}
