package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links=	driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}

}
