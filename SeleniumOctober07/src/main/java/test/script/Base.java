package test.script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public WebDriver driver;   //created object-'driver' and it is public.
	public void initializeBrowser() {
		driver=new ChromeDriver();  //loading the chromedriver into object-driver(variable) //browser initialization
		driver.get("https://selenium.qabible.in/");  //used to launch url or website
		//driver.get("https://www.w3schools.com/js/js_popup.asp");
		//implicit wait after url loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//to maximise screen
		
	
	}
	public void driverQuitAndClose() {
		//driver.close();//to close parent window ONLY
		driver.quit();//to close all windows including parent window
	}
	

	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitAndClose();
	}

}
