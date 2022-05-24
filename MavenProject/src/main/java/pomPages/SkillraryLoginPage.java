package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	// Declaration 
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement Skillraydemoapp;
	
	@FindBy(name="q")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement searchButton;
	
	
	// Initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gersbutton()
	{
		gerasbtn.click();
	}
	
	public void skillrraydemoApplication()
	{
		Skillraydemoapp.click();
	}
	
	public void searchtextbox(String name)
	{
		searchTextBox.sendKeys(name);
		
	}
	
	public void searchbutton()
	{
		searchButton.click();
	}
}
