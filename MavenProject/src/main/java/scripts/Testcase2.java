package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;
import pomPages.Testingpage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gersbutton();
		s.skillrraydemoApplication();
		
		SkillraryDemoApplication sd = new SkillraryDemoApplication(driver);
		driverutilites.switchTabs(driver);
		driverutilites.dropDown(sd.getCourseTab(), p.getPropertyFiledata("Category"));
	
		
		Testingpage t = new Testingpage(driver);
		driverutilites.dragdrop(driver,t.getFacebookicon(),t.getCart());
		 Point fb = t.getFacebookicon().getLocation();
		
		int x = fb.getX();
		int y = fb.getY();
	
		driverutilites.scrollBar(driver, x, y);
		t.facebook();
		
	}

}
