package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import utils.BaseTest;


public class LoginWithTestNgParameters extends BaseTest {

	@Parameters({"user", "pass"})
	@Test
	public void loginWithParameters(String user, String pass) throws InterruptedException {
		
		page.navMenu.navigateTo(page.navMenu.loginLink);
		page.loginPage.loginInApp(user, pass);
		assertTrue(page.loginPage.sucessloginMessage.isDisplayed());
		page.loginPage.logoutFromApp();
		
	}
	
	
}
