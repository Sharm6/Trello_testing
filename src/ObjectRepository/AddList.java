package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddList {
	WebDriver driver;
	public AddList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='board']/div/form/span")
	WebElement addlistLink;
	
	@FindBy(xpath = ".//*[@id='board']/div/form/input")
	WebElement addlisttextField;
	
	@FindBy(xpath = ".//*[@id='board']/div/form/div/input")
	WebElement listSavebtn;
	
	public WebElement AddlistLink()
	{
		return addlistLink;
	}

	public WebElement AddlistTextField()
	{
		return addlisttextField;
	}
	
	public WebElement ListSaveBtn()
	{
		return listSavebtn;
	}
}
