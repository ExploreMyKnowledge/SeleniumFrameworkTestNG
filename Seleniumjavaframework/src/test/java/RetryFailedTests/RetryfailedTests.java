package RetryFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.RetryFailedTestListeners;
/**
 * Program demonstrating rerunnning failed tests.
 * 1. By looking at testng-failed.xml which is similar like testng xml file. (MAnually)
 * 2. By running 2 commanda specified in tesNG official website
 * 3. By creating an interface of ITestAnalyzer in a class and call it as parameter at the test.ex-test3
 * */
public class RetryfailedTests {
	
	@Test
	public void testmethod1() {
		
		System.out.println("in test1");
	}
	@Test
	public void testmethod2() {
		
		System.out.println("in test2");
		
	}
	@Test(retryAnalyzer = RetryFailedTestListeners.class)
	public void testmethod3() {
		
		System.out.println("in test3");
		Assert.assertTrue(3<2);
	}
}
