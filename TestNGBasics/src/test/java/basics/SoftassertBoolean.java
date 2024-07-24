package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftassertBoolean {
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
	    driver.manage().window().maximize();
	}

	@Test
	public void radiobutton()
	{
		WebElement radiomale=driver.findElement(By.id("inlineRadio1"));
		Boolean beforemalesel=radiomale.isSelected();
		System.out.println(beforemalesel);
		System.out.println("Is Enabled" +radiomale.isEnabled());
		radiomale.click();
		Boolean aftermalesel=radiomale.isSelected();
		System.out.println(aftermalesel);
		
		//verifies element is displayed or not
				System.out.println("Is Displayed" +radiomale.isDisplayed());
				
				//verifies element is clickable
				System.out.println("Is Enabled" +radiomale.isEnabled());
				
				
		WebElement gender=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		Boolean gendercheck=gender.isSelected();
		System.out.println("isSelected " +gendercheck);
		gender.click();
		System.out.println("isSelected after click " +gendercheck);
		Boolean gendercheck2=gender.isDisplayed();
		System.out.println("isDisplayed " +gendercheck2);
		
		
		WebElement  age=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		Boolean agegroup=age.isEnabled();
		System.out.println("Is enabled " + agegroup);
		age.click();
		System.out.println("Is selected= " + age.isSelected());
		System.out.println("Is displayed= " + age.isDisplayed());
		
		
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("username");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("pass");
		
		
		
	}
}
