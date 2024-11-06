package test.script2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Multiplewindowhandling extends Base {
	public void multipleWindowHandling() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent is: "+parent);
		System.out.println(driver.getTitle());
		System.out.println("---------------------------------------------");
		Set<String> allwindows=driver.getWindowHandles();
		for(String temp:allwindows) {
			System.out.println("window is: "+ temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("******************************************");
		}
	}

	public static void main(String[] args) {
		Multiplewindowhandling multiplewindowhandling=new Multiplewindowhandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multipleWindowHandling();
		//multiplewindowhandling.driverQuitAndClose();

	}

}
