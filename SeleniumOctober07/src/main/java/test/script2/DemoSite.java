package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base; //package needs to be imported

public class DemoSite extends Base{
	public void demo() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Navamy");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
	}
	public void demohomework() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("2");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("3");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
	}
	public static void main(String[] args) {
		DemoSite demosite=new DemoSite();
		demosite.initializeBrowser();
		//demosite.demo();
		demosite.demohomework();
		//demosite.driverQuitAndClose();
		

	}

}
