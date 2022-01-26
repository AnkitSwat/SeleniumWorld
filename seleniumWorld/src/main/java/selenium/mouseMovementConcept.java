package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
				
				
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		Actions action= new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[1]"))).build().perform();
	
		action.moveToElement(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8]"))).build().perform();
		
		
	}

}
