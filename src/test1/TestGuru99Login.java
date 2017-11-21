/**
 * 
 */
package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagees.Guru99HomePage;
import pagees.Guru99LoginPage;

/**
 * @author user
 *
 */
@Test
public class TestGuru99Login 
{
	public WebDriver driver;
	
	//Guru99LoginPage objLogin;
	
	//Guru99HomePage objHomepage;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4");
	}
	
	@Test
	public void verify_Logintitle()
	{
		Guru99LoginPage objLogin = PageFactory.initElements(driver, Guru99LoginPage.class);
		objLogin.loginGuru99("mngr105657", "hyjAseg");
		 String logintxt = objLogin.getLoginTitle();
		 Assert.assertTrue(logintxt.equalsIgnoreCase("Guru99 Bank"));
	}
	
}
