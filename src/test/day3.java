package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WeblogincarLoan(String urlname, String Key )
	{
		//Selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(Key);
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("After executing all methods in class");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	
	public void MobilesignincarLoan()
	{
		System.out.println("mobilesignin");
	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username, String password )
	{
		System.out.println("mobilesignout");
		System.out.println(username);
		System.out.println(password);
		
	}
	@Test(dependsOnMethods= {"WeblogincarLoan","MobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination- usrname password- good credit history
		//2nd -usrname password- no credit history
		//3rd - fraudelent credit history
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for the particular combination(row)
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}

}
