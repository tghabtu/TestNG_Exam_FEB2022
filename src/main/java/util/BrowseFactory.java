package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
static WebDriver driver;
	

	public static WebDriver  init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(" http://techfios.com/test/101/");
		return driver;
	}
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	}

}


