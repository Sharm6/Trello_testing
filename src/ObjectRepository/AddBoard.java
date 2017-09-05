package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBoard {
	
	WebDriver driver;
	public AddBoard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='content']/div/div[2]/div/div/div[1]/ul/li")
	private List<WebElement> newBoard;
	
	@FindBy(id = "boardNewTitle")
	WebElement newTitle;
	
	@FindBy (xpath = "html/body/div[5]/div/div[2]/div/div/div/form/input[3]")
	WebElement createbtn;

	public List<WebElement> NewBoard()
	{
		
		return newBoard;
	}
	
	public WebElement NewBoardTitle()
	{
		return newTitle;
	}
	
	public WebElement CreateBtn()
	{
		return createbtn;
	}
}
