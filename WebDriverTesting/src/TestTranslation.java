import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTranslation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com/translator");
		//driver.findElement(By.xpath("//select[@id='t_tl']")).sendKeys("Hindi");
		Select select=new Select(driver.findElement(By.xpath("//select[@id='t_tl']")));
		select.selectByValue("hi");
		driver.findElement(By.xpath("//textarea[@id='t_sv']")).sendKeys("i love my india");
		
	}

}
