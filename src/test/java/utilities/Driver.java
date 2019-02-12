package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver != null) {
			return driver;
		}
		String browser = Config.getValue("browserType").toLowerCase();
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		
		driver.manage().window().fullscreen();
		String time = Config.getValue("implicitWait");
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(time), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		return driver;
	}
	public static void openUrl(){
		getDriver();

	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
















