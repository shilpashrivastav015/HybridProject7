package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;
import GenericLib.WebDriverUtilities;

public class Testcase1 extends BaseClass {
	@Test
	public void Tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gersbutton();
		s.skillrraydemoApplication();
				
		SkillraryDemoApplication d= new SkillraryDemoApplication(driver);
		driverutilites.switchTabs(driver);
    	driverutilites.mouseHover(driver,d.getCourseTab());
		d.SeleniumTrainingTab();
		
		AddToCart a = new AddToCart(driver);
		driverutilites.doubleClick(driver, a.getAddbutton());
		a.AddToCart();
		driverutilites.alertPopup(driver);
	}
}
