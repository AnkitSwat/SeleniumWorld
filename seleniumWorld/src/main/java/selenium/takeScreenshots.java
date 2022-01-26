package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class takeScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("E:\\google.png"));
	
	
	}

}
