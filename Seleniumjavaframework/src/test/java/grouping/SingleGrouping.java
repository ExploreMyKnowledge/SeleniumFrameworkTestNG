package grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
/**
*class level groups are set for grouping to be implemented for all the tests inside that class.
*It will take class level group + individual assigned groups
*/

//@Test(groups = {"classlevelgroup"})
public class SingleGrouping {
	@Test(groups = {"smoke", "sanity"})
	public void test1() {
		System.out.println("This is test1");	
		}
	@Test(groups = {"smoke","regression"})
	public void test2() {
		System.out.println("This is test2");	
		}
	@Test(groups = {"sanity","regression"} )
	public void test3() {
		System.out.println("This is test3");	
		}
	@Test(dependsOnGroups =  {"smoke"})
	public void test4() {
		System.out.println("This is test4");	
		}
	@Test
	public void test5() {
		System.out.println("This is test5");	
		}
	/**@Test(dependsOnMethods = {"test5","test3"})
	public void test6() {
		System.out.println("This is test6");	
		} */
}
