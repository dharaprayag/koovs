package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base 
{
	protected WebDriver driver;	
	protected String siteUrl;
	//protected String titleName;
	protected String Email;
	protected String Password;
	protected String MensProductCategory;
	
	protected String fileInputStream = "C://Users//dhara//eclipse-workspace2//koovs//src//main//java//Resources//data.properties";
	protected String mensProductCategory;
	protected String brandName;
	protected String colorName;
	protected String pricerange;
	protected String shirtName;
	protected String shirtSize;
	protected String jeansSize;
	protected String mensProductCategory1;
	
	
	public WebDriver initilizeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fileInputStream); //Here input data properties path
		prop.load(fis);
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		siteUrl = prop.getProperty("siteURL");
		Email = prop.getProperty("Email");
		Password = prop.getProperty("Password");
<<<<<<< HEAD
		MensProductCategory = prop.getProperty("MensProductCategory");
		
=======
		mensProductCategory = prop.getProperty("MensProductCategory");
		brandName =prop.getProperty("BrandName");
		colorName = prop.getProperty("ColorName");
		pricerange =prop.getProperty("PriceRange");
		shirtName = prop.getProperty("ShirtName");
<<<<<<< HEAD
		shirtSize = prop.getProperty("ShirtSize");
		jeansSize = prop.getProperty("JeansSize");
		mensProductCategory1 = prop.getProperty("MensProductCategory1");
=======
		shirtName1 = prop.getProperty("ShirtName1");
		size = prop.getProperty("Size");
>>>>>>> 5589e10fb7e955d7345243ac4e9fc6c99692ab18
>>>>>>> 5d3fe40dc568fad4277db13963518c055813531f
		//titleName = prop.getProperty("titleName");
		 
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			//It executes in Chrome Browser
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
			driver = new ChromeDriver(notification);
		}
		else if(browserName.equals("firefox"))
		{
			//It executes in Firefox Browser
			System.setProperty("webdriver.gecko.driver",  prop.getProperty("firefoxPath"));
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equals("IE"))
		{
			//It executes in Internet Explorer
			System.setProperty("webdriver.ie.driver",  prop.getProperty("internetExplorerPath"));
			driver = new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;	
	}
	

}
