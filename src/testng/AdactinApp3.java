package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp3 {
	
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ..");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(false);
		System.out.println("Login Successfull...");
		
	}
	
	@Test(priority = 1)
	public void registrationTest()
	{
		
		System.out.println("Registration Successfull...");
		
		
	}
	
	@Test(priority = 3)
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
