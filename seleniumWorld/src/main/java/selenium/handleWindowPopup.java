package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
	
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		
		String parentId= it.next();
		System.out.println("parent window hanle id is: " +parentId);
		
		String childId = it.next();
		System.out.println("Child window handle id is: " +childId);
	
	driver.switchTo().window(childId);
	driver.switchTo().window(parentId);
	driver.switchTo().window(childId);
	System.out.println("child window title: "+driver.getTitle());
		
	driver.close();
	driver.switchTo().window(parentId);
	System.out.println(driver.getTitle());
	
	
	}

}
