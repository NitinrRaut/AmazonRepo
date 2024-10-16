package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
  @FindBy (xpath="//input[@type='email']")
  private WebElement UserName;
  
  @FindBy (xpath="//input[@id='continue']")
  private WebElement Contiue;
  
 WebDriver driver;

public SignInPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	
}
public SignInPage() {
	// TODO Auto-generated constructor stub
}
public void enterUserName(String un)
{
	UserName.sendKeys(un);
}
public void clickOnContiue()
{
	Contiue.click();
}

}
