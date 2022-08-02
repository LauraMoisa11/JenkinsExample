package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="log") public WebElement usernameField;
	@FindBy(id="password") public WebElement passwordField;
	@FindBy(xpath ="//input[@class='submit_button']") public WebElement submitButton;
	@FindBy(xpath="//li[@class='menu_user_logout']") public WebElement logoutButton;
	@FindBy(xpath = "//a[@class='popup_close']")public WebElement closePopUp;
	
	@FindBy(xpath="//div[contains(@class, 'sc_infobox_style_success')]") public WebElement sucessloginMessage;
	@FindBy(xpath="//div[contains(@class, 'sc_infobox_style_error')]") public WebElement errorLoginMessage;
	
	public void loginInApp(String username, String parola) {

		usernameField.sendKeys(username);
		passwordField.sendKeys(parola);

		submitButton.click();	


	}
	
	public void logoutFromApp() throws InterruptedException {
		//WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		Thread.sleep(3000);
		logoutButton.click();
		

	}
	
	
	public void closeLoginPopUp() {
		usernameField.clear();
		passwordField.clear();
		closePopUp.click();


		
	}
	
}
