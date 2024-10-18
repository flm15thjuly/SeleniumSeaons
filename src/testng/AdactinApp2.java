package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinApp2 {
	
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
		Assert.assertTrue(false);
		System.out.println("Login Successfull...");
		System.out.println("Browser Closed ..");
	}
	
	@Test(priority = 1)
	public void registrationTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
		System.out.println("Registration Successfull...");
		System.out.println("Browser Closed ..");
		
	}
	
	@Test(priority = 3)
	public void forgotPasswordTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
		System.out.println("Forgot Password Successfull...");
		System.out.println("Browser Closed ..");
		
	}
	
	@Test(priority = 4,dependsOnMethods = "loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
		System.out.println("Change Password Successfull...");
		System.out.println("Browser Closed ..");
		
	}
	

}
