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
 *This Page contains all the elements of guru99 Home page and also methods
 */
public class Guru99HomePage 
{
	
	public WebDriver driver;
	
	@FindBy(xpath="//table//tr[@class='heading3']") WebElement Homepagetxt;
	
	
	public Guru99HomePage(WebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageText()
	{
		return Homepagetxt.getText();
	}
	
}
