package utils;

import pages.LoginPage;
import pages.NavMenuPage;

public class BasePage extends BaseTest {

	public NavMenuPage navMenu = new NavMenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	
	
}
