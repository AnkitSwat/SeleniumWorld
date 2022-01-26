package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class implicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

}
