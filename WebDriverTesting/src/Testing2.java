import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");
		driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("test245588@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("SoftwareTesting");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}

}
