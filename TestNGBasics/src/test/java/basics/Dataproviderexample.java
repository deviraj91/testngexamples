package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Dataproviderexample {
		WebDriver driver;
		//SoftAssert softassert=new SoftAssert();
		@BeforeMethod
		public void launchbrowser()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		}
		@Test (dataProvider = "amazondata" ,dataProviderClass = Dataproviderseg1.class)
		//one dimensional data
		//dataprovider name entered and mention the class of that dataprovider. 
	public void amazonsearch(String product)
	//add the parameter to receive the data from the dataprovider class
	{
		System.out.println(product);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(product);
		WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
     }
		@Test (dataProvider = "facebooklogin" ,dataProviderClass = Dataproviderseg1.class)
		public void facebooklaunch(String username,String pass)
		//two dimensional data
		//add 2 parameters to receive the data from the dataprovider class
		{
			driver.get("https://www.facebook.com/");
			WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys(username);
			WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
			password.sendKeys(pass);
		}
}