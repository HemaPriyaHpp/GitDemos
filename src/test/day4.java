package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("webloginHome");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String uname)
	{
		System.out.println("mobileloginHome");
	}
	@Test(groups= {"Smoke"})
	public void LoginApIHomeLoan()
	{
		System.out.println("APIloginHome");
	}
	

}

