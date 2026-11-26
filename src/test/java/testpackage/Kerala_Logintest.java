package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Base_class;

public class Kerala_Logintest extends Base_class{
	
	@Test(priority = 1)
	public void title_verification_mthd()
	{
		LoginKeralaobj.titlemthd();
		String actualTitle = LoginKeralaobj.titlemthd();
		Assert.assertEquals(actualTitle,"Kerala Property");
	}
	
	@Test(priority = 2)
	public void login_verification_mthd()
	{
		LoginKeralaobj.loginmthd();
	}

			
}
