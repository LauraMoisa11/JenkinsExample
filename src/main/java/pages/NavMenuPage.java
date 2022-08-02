package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavMenuPage {
	
	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory
	//@FindBy este o prescurtare pentru driver.findElemenet(By..)
	@FindBy(xpath="(//a[contains(@class, 'popup_login_link')])[1]" ) public WebElement loginLink;
	//WebElement loginLink = driver.findElement(By.xpath("(//a[contains(@class, 'popup_login_link')])[1]"));
	
	@FindBy(linkText = "CONTACTS") public WebElement contactsLink;
	//WebElement contactsLink = driver.findElement(By.linkText("CONTACTS"));
	@FindBy(linkText = "BLOG") public WebElement blogLink;
	@FindBy(linkText = "Post Formats") public WebElement postFormatsLink;
	@FindBy(linkText = "BOOKS") public WebElement shopLink;
	@FindBy(linkText = "Portfolio") public WebElement portfolioLink;
	@FindBy(linkText = "Portfolio 2 columns") public WebElement portfolio2Link;

	public void navigateTo(WebElement element) {
		element.click();
	}
	
	public void hoverMenu(WebElement element) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
	
	
	
	
	
}
