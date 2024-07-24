package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationexample {
	
@BeforeSuite
public void beforesuite()
{
	System.out.println("running before suite");
}

@BeforeTest
public void beforetest()
{
	System.out.println("running before test");
	
}

@BeforeClass
public void beforeclass()
{
	System.out.println("running before class");
	
}

@BeforeMethod
public void beforemethod()
{
	System.out.println("running before method");
	
}
@Test
public void testcases1()
{
	System.out.println("testcase1");
}

@Test
public void testcase2()
{
	System.out.println("Testcase2");
}

@AfterMethod
public void afterethod()
{
	System.out.println("After method");
}

@AfterClass
public void afterclass()
{
	System.out.println("After class");
}

@AfterTest
public void aftertest()
{
	System.out.println("After test");
}

@AfterSuite
public void aftersuite()
{
	System.out.println("After suite");
}

}
