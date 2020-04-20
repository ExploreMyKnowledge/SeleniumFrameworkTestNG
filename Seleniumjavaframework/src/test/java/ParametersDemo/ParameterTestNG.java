package ParametersDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTestNG {
	
	
	@Parameters({"Myname"})
	@Test	
	public void testParameters(String name) {
		System.out.println("name is " + name);		
	}
	
	@Parameters({"Mynameoptional"})
	@Test	
	public void testParametersOptional(@Optional("this is optional value in case name is not given") String name) {
		System.out.println("name is " + name);		
	}
}
