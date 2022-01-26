package selenium;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
	}

	@SuppressWarnings("deprecation")
	public static void clickOn(WebDriver driver,WebElement locator, int timeOut)
	{
		new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
	}
	
}
