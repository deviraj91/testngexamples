package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictestcase {
		WebDriver driver;
		
		@BeforeMethod
		public void launchbrowser()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
		    driver.manage().window().maximize();
		}
		@Test(priority=2,invocationCount = 2)
		public void verifyShowMessage()
		{
			WebElement showMessage= driver.findElement(By.xpath("//button[@id='button-one']"));
			String actualLabel=showMessage.getText();
			String expectedLabel="ShowMessage";
			Assert.assertEquals(actualLabel, expectedLabel);
			System.out.println("devi");
		}
		@Test(priority=1,enabled=false)
		public void cssvalues()
		{
			WebElement showMessage= driver.findElement(By.xpath("//button[@id='button-one']"));
		    String backgroundcolor=showMessage.getCssValue("background-color");
			System.out.println("backgroundcolor = " + backgroundcolor);
			
			String fontcolor=showMessage.getCssValue("color");
			System.out.println("fontcolor = " + fontcolor);
			
			String fontSize=showMessage.getCssValue("font-size");
			System.out.println("fontSize = " +fontSize);
			
			String fontStyle=showMessage.getCssValue("font-style");
			System.out.println("fontStyle = " + fontStyle);
			
			String fontweight=showMessage.getCssValue("font-weight");
			System.out.println("fontweight = " + fontweight);			
		}	
		@Test(dependsOnMethods = "verifyShowMessage")
		public void depends()
		{
			WebElement showMessage= driver.findElement(By.xpath("//button[@id='button-one']"));
		    String backgroundcolor=showMessage.getCssValue("background-color");
			System.out.println("backgroundcolor = " + backgroundcolor);
			
			String fontcolor=showMessage.getCssValue("color");
			System.out.println("fontcolor = " + fontcolor);
		}
		
}
