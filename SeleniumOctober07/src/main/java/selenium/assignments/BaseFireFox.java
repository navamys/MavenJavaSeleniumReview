package selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseFireFox {
	public WebDriver driver;
	public void initializeBrowser() {
		driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
	}

	public static void main(String[] args) {
		BaseFireFox obj=new BaseFireFox();
		obj.initializeBrowser();

	}

}
