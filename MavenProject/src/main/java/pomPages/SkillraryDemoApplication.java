package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {

	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement courseTab;
	
	@FindBy(name="addresstype")
	private WebElement Category;
	
	public WebElement getCategory() {
		return Category;
		
	}
	public WebElement getCourseTab() {
		return courseTab;
	}
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement SeleniumTraining;
	
	
	public SkillraryDemoApplication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
	}
	public void SeleniumTrainingTab() {
		SeleniumTraining.click();
	}
}
