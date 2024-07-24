package basics;

import org.testng.annotations.DataProvider;

public class Dataproviderseg1 {

	
	@DataProvider(name="amazondata")
	public Object[][] mobile()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"},{"toys"}};
	}
	
	@DataProvider(name="facebooklogin")
	
	public Object[][] logindetails()
	{
		return new Object [][] {{"deviraj","abc123"},{"gauribal","sdf111"},{"dhyam","hjkl456"}};
	}
}


