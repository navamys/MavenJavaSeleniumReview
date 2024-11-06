package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test.script.Base;

public class Actionclass extends Base {
	public void doubleClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement droparea=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);  //passing driver to perform actions
		actions.doubleClick(draggablen1).build().perform();
		
	}
	public void mouseHover() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver); 
		actions.moveToElement(draggablen1).build().perform();
	}
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement droparea=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(draggablen1, droparea).build().perform();
	}
	public void rightClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.contextClick(draggablen1).build().perform();
	}

	public static void main(String[] args) {
		Actionclass actionclass=new Actionclass();
		actionclass.initializeBrowser();
		//actionclass.doubleClick();
		//actionclass.mouseHover();
		//actionclass.dragAndDrop();
		actionclass.rightClick();
		//actionclass.driverQuitAndClose();

	}

}
