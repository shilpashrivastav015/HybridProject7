package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		   SkillraryLoginPage s= new SkillraryLoginPage(driver);
				
			s.searchtextbox(p.getPropertyFiledata("name"));
			s.searchbutton();
			
			CoreJavaPage c= new CoreJavaPage(driver);
			c.corejavaselenium();
			
			WishlistPage w= new WishlistPage(driver);
			driverutilites.switchFrame(driver);
			w.playbutton();
			Thread.sleep(10000);
			w.pausebutton();
			driverutilites.switchBackframe(driver);
			w.addtowishlistbtn();
			
	}

	
}
