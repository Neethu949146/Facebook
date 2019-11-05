package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login 
{
	@FindBy(xpath="//button[.='✕']")
	private WebElement clsbtn;
	@FindBy(xpath="//span[.='Cart']")
	private WebElement cbtn;
	@FindBy(xpath="//div[.='My Cart']")
	private WebElement ctele;
	public Acti_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void cls()
	{
		clsbtn.click();
	}
	public void cbtn()
	{
		cbtn.click();
	}
	public void melemnt()
	{
		String txt = ctele.getText();
		System.out.println(txt);
	}
	

}
