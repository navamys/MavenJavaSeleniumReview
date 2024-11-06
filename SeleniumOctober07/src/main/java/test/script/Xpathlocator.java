package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpathlocator extends Base{
	public void Xpath() {
		//syntax: //tagname[@attribute='value']
		// here double slash(//)represents current node(node is any web element), @ represents attribute
		WebElement element1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement element2=driver.findElement(By.xpath("//div[@id=\'message-one\']"));
		WebElement element3=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement element4=driver.findElement(By.xpath("//input[@id='value-b']"));
	}
	public void contains() {
		//syntax: //tag[contains(@attribute,'value')]
		WebElement element5=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		WebElement element6=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	}
	public void startswith() {
		// syntax: //tag[starts-with(@attribute,'value')]
		WebElement element7=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
		WebElement element8=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	}
	public void text() {
		//syntax: //tag[text()='text']
		WebElement element9=driver.findElement(By.xpath("//button[text()= 'Show Message']"));
		WebElement element10=driver.findElement(By.xpath("//a[text()= 'Simple Form Demo']"));
	}
	public void and() {
		//syntax:  //tag[@attribute='value' and @attribute='value']
		WebElement element11=driver.findElement(By.xpath("//button[@id='button-one' and @class=\"btn btn-primary\"]"));
		WebElement element12=driver.findElement(By.xpath("//input[@id='single-input-field' and @placeholder='Message']"));
	}
	public void or() {
		//syntax:  //tag[@attribute='value' or @attribute='value']
		WebElement element12=driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']"));
		
	}
	public static void main(String[] args) {
		Xpathlocator xpathlocator=new Xpathlocator();
		xpathlocator.initializeBrowser();
		xpathlocator.contains();
		xpathlocator.startswith();
		xpathlocator.text();
		xpathlocator.driverQuitAndClose();
		
		

	}

}
