package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethods extends Base{
	public void axes() {
		WebElement parent= driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement child=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		WebElement followingsubling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='header-top']"));
		WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
		WebElement ancestor= driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::ul"));
		WebElement 	index= driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div)[2]"));
	
		
	}
}
