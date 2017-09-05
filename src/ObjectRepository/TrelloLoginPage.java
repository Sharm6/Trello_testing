package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrelloLoginPage {
	WebDriver driver;
	
	public TrelloLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstLogin = By.xpath("html/body/div[1]/div[2]/a[1]");
	By user = By.id("user");
	By password = By.id("password");
	By go = By.id("login");
	
	public WebElement FrontLogin()
	{
		return driver.findElement(firstLogin);
	}
	
	public WebElement Username()
	{
		return driver.findElement(user);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(go);
	}
}
