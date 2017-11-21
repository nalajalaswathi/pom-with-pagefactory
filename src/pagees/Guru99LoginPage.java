/**
 * 
 */
package pagees;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swathi
 * This Page contains all the elements of guru99 login page and also methods
 */
public class Guru99LoginPage 
{
	public WebDriver driver;
	
	@FindBy(name="uid") 
	WebElement guru99_username;
	
	@FindBy(name="password") 
	WebElement guru99_password;
	
	@FindBy(name="btnLogin") 
	WebElement guru99_login;
	
	@FindBy(className="btnLogin") 
	WebElement guru99_logintitle;
	
	
	public Guru99LoginPage(WebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void typeUserName(String username)
	{
		guru99_username.sendKeys(username);
	}
	
	public void typePassword(String pasword)
	{
		guru99_password.sendKeys(pasword);
	}
	
	public void clickLogin()
	{
		guru99_login.click();
	}
	
	public String getLoginTitle()
	{
		return  guru99_logintitle.getText();
	}
	
	public void loginGuru99(String username,String pasword)
	{
		this.typeUserName(username);
		this.typePassword(pasword);
		this.clickLogin();
	}
	
}
