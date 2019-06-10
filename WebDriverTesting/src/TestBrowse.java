import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowse {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");
		System.setProperty("webdriver.chrome.driver","/home/dhruv/chromedriver2.42");
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}
