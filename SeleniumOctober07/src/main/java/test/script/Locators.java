package test.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void id() {
		//Syntax: WebElement elementname=driver.findElement(By.locator(""));
		WebElement element1=driver.findElement(By.id("single-input-field"));
		element1.sendKeys("Hello"); //to enter value-hello in the field
		WebElement element2=driver.findElement(By.id("button-one"));
		element2.click();  //to click button
	}
	/*public void idexamples() {
		WebElement element3=driver.findElement(By.id("value-a"));
		//element3.sendKeys("5"); 
		WebElement element4=driver.findElement(By.id("value-b"));
		//element4.sendKeys("10");
		WebElement element5=driver.findElement(By.id("button-two"));
		//element5.click();
	} */
	public void className() {
		WebElement element6=driver.findElement(By.className("form-control datepicker"));
		WebElement element7=driver.findElement(By.className("form-control"));
		WebElement element8=driver.findElement(By.className("mb-sec"));
	}
	public void name() {
		WebElement element9=driver.findElement(By.name("viewport"));
		WebElement element10=driver.findElement(By.name("description"));
		WebElement element11=driver.findElement(By.name("author"));
	}
	public void linkText() {
		WebElement element12=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement element13=driver.findElement(By.linkText("Checkbox Demo"));
	}
	public void partialLinkText() {
		WebElement element14=driver.findElement(By.partialLinkText("Simple F"));//simple have duplicate but simple f is unique
		WebElement element15=driver.findElement(By.partialLinkText("Checkbox D"));
	}
	public void linkCountUsingTagname() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
	public void imageCountUsingTagname() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}
	

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser();
		//locators.id();
		//locators.className();
		//locators.name();
		//locators.linkText();
		//locators.partialLinkText();
		locators.linkCountUsingTagname();
		locators.imageCountUsingTagname();
		locators.driverQuitAndClose();

	}

}
