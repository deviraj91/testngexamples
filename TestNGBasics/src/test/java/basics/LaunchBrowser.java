package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://amazon.in/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void verifypagetitle()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expected="Devi R raj";
		
		Assert.assertEquals(actualtitle,expected,"this is an issue");
	}
	
	
	
}
