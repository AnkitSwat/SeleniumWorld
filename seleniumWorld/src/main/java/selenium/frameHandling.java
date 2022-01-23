package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Open New Window")).click();
		
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.id("mobile_menu_toggler")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Open New Window")).click();
	}

}
