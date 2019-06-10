import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href")+"-------"+links.get(i).getText());
		}

	}

}
