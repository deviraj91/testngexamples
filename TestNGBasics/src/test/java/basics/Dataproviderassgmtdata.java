package basics;

import org.testng.annotations.DataProvider;

public class Dataproviderassgmtdata {

	@DataProvider(name= "formdetails")
	public Object[][] details()
	{
		return new Object[][] {{"devi","raj","bala","tvm","kerala","123456"},{"molu","raj","tsr","krr","nanu","45666"}};
	}
	
	@DataProvider(name="amazon product")
	public Object[][] productData()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"},{"flowers"}};
	}
}
