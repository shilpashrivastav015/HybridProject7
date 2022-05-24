package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement SeleniumTraning;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public Testingpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SeleniumTraningTab()
	{
		SeleniumTraning.click();
	}
	
	public void addtocart()
	{
		cart.click();
	}
	
	
	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	public void facebook()
	{
		facebookicon.click();
	}
	

}
