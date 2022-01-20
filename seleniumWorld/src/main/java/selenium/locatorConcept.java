package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9084611551");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("4555454");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"1\"]")));
		select.selectByVisibleText(null);
	}

}
