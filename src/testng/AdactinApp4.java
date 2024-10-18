package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp4 {
	
	
	@BeforeMethod(onlyForGroups="smoke")
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
	}
	
	@AfterMethod(onlyForGroups="smoke")
	public void teardown()
	{
		System.out.println("Browser Closed ..");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("Login Successfull...");
		
	}
	
	@Test(priority = 1,groups = "smoke")
	public void registrationTest()
	{
		
		System.out.println("Registration Successfull...");
		
		
	}
	
	
	@Test(priority = 3,groups = "smoke")
	public void forgotPasswordTest()
	{
		
		System.out.println("Forgot Password Successfull...");
		
		
	}
	
	@Test(priority = 4,dependsOnMethods = "loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change Password Successfull...");
		
		
	}
	
	

}
