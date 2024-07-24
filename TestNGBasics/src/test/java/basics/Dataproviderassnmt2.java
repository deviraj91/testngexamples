package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dataproviderassnmt2 {
	WebDriver driver;
	@BeforeMethod
	public void launchurl()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "formdetails", dataProviderClass = Dataproviderassgmtdata.class )
	public void entereddata(String first,String last,String user,String cit, String sta,CharSequence[] pin)
	{
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys(first);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys(last);
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys(user);
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys(cit);
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys(sta);
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys(pin);
	}	
	}