package testNG;

import org.testng.annotations.Test;

import basics1.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class TNG2 extends BaseClass
{
	@BeforeMethod
	  public void startup()
	{
		launch("chrome");
		navigate("https://www.amazon.in");
		
	 }
  @Test
  public void amazon() 
  {
	  WebElement elm1 = driver.findElement(By.id("searchDropdownBox"));
		elm1.sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Poter");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

  }
  

  @AfterMethod
  public void endprocess() 
  {
	  driver.close();
  }

}
