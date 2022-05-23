package basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_001 extends baseclass
{

	public static void main(String[] args) 
	{
		launch("chrome");
		navigate("https://www.amazon.in");
		WebElement elm1 = driver.findElement(By.id("searchDropdownBox"));
		elm1.sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Poter");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

}
