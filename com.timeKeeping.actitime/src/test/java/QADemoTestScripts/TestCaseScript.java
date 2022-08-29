/**
 * 
 */
package QADemoTestScripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoqa.com.Element_TextBox;
import demoqa.com.QaDemoLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author princ
 *
 */
public class TestCaseScript {
	
	@Test
	
	public void test()  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/login");
	
	QaDemoLogin login= new QaDemoLogin(driver);
	login.loginAction("priraaz" , "Pri@12345");
	
	Element_TextBox element=new Element_TextBox(driver);
	element.getSideMenuElement_Link().click();
	
	
	
	//driver.quit();
	
	}
}
	
	
	
