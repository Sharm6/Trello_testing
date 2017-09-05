package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.AddCart;
import ObjectRepository.TrelloLoginPage;
import ObjectRepository.AddBoard;
import ObjectRepository.AddList;

public class AddCartWithText {
	
@Test
public void AddCartWithTextOnly()
{
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://trello.com/");
	TrelloLoginPage tl = new TrelloLoginPage(driver);
	tl.FrontLogin().click();
	tl.Username().sendKeys("shalini001");
	tl.password().sendKeys("InterView1");
	tl.login().click();
	WebDriverWait d = new WebDriverWait(driver, 5);
	d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div/div[2]/div/div/div[1]/div/h3")));
	
	AddBoard ab = new AddBoard(driver);
	//ab.NewBoard().click();
	int sizeOfList = ab.NewBoard().size();
	int correctSize = sizeOfList - 1;
	for(int i = correctSize; i >=0; i++)
		{
			if(correctSize == i)
			{
				  ab.NewBoard().get(i).click();			}
		}
		
	ab.NewBoardTitle().sendKeys("Trello");
	ab.CreateBtn().click();
	WebDriverWait d1 = new WebDriverWait(driver, 5);
	d1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='permission-level']/span[2]")));
	
	AddList al = new AddList(driver);
	al.AddlistLink().click();
	al.AddlistTextField().sendKeys("To Do Task");
	al.ListSaveBtn().click();
	
	AddCart ac = new AddCart(driver);
	ac.AddCartLink().click();
	ac.AddCartTextArea().sendKeys("Create Login Page");
	ac.AddCartBtn().click();
	
}


	

}
