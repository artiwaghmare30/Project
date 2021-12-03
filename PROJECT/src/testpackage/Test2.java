package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite2");
	}

	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("beforetestmethod2");
	}

	@BeforeClass
	public void beforeclass2()
	{
		System.out.println("beforeclass2");
	}
	@BeforeMethod
	public void beforemethod2()
	{
		System.out.println("beforemethod2");
	}
	@Test
	public void testA()
	{
		System.out.println("testclassA");
	}
	@Test
	public void testB()
	{
		System.out.println("testclassB");
	}
	
	@AfterMethod
	public void Aftermethod2()
	{
		System.out.println("Aftermethod2");
	}
	@AfterClass
	public void Afterclass2()
	{
		System.out.println("Afterclass2");
	}
	@AfterTest
	public void Aftertestmethod2()
	{
		System.out.println("Aftertestmethod2");
	}
	@AfterSuite
	public void Aftersuite2()
	{
		System.out.println("Aftersuite2");
	}

}


