package basics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	       public static WebDriver driver;
			public static void launch(String browser)
			{
				if(browser.equals("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver= new ChromeDriver();
					driver.manage().window().maximize();
				}
				else if(browser.equals("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
			}
				public static void navigate(String url)
				{
					driver.get(url);
				}

		


	}


