package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	WebDriver driver;
	public AddCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='board']/div[1]/div/a")
	WebElement addcartlink;
	
	@FindBy(xpath = ".//*[@id='board']/div[1]/div/div[2]/div/div[1]/div/textarea")
	WebElement addcartTextArea;
	
	@FindBy(xpath = ".//*[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/input")
	WebElement addcartbtn;
	
	@FindBy(xpath = ".//*[@id='board']/div[1]/div/div[2]/a/div[3]/span")
	WebElement addcartEditTextArea;
	
	@FindBy(xpath = "html/body/div[4]/div/div/div/div[6]/div[1]/div/a[5]")
	WebElement attachment;
	
	@FindBy(xpath = "html/body/div[5]/div/div[2]/div/div/div/ul/li[1]/form/input[3]")
	WebElement CompAttachment;
	
	public WebElement AddCartLink()
	{
		return addcartlink;
	}
	
	public WebElement AddCartTextArea()
	{
		return addcartTextArea;
	}
	
	public WebElement AddCartBtn()
	{
		return addcartbtn;
	}
	
	public WebElement AddCartEditTextArea()
	{
		return addcartEditTextArea;
	}
	
	public WebElement Attachment()
	{
		return attachment;
	}
	
	public WebElement ComputerAttachment()
	{
		return CompAttachment;
	}
}
