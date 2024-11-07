package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.script.Base;

public class Dropdown extends Base{
	public void index() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectcolor); //Select is class given by selenium
		select.selectByIndex(1);  //to select red color
	}
	public void value() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectcolor);
		select.selectByValue("Yellow"); //attribute value='Yellow' in DOM
	}
	public void visibleText() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectcolor);
		select.selectByVisibleText("Green");
	}
	public static void main(String[] args) {
		Dropdown dropdown=new Dropdown();
		dropdown.initializeBrowser();
		dropdown.index();
		//dropdown.value();
		//dropdown.visibleText();
		//dropdown.driverQuitAndClose();
		
		
		

	}

}
