package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Checkbox extends Base {
	public void checkbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickonthischeckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickonthischeckbox.click();
	}
	public void isselected() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickonthischeckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//clickonthischeckbox.click();
		boolean checkbo=clickonthischeckbox.isSelected();
		System.out.println(checkbo);
	}
	public void homework() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickonthischeckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//clickonthischeckbox.click();
		boolean checkbo=clickonthischeckbox.isSelected();
		if(checkbo==true) {
			clickonthischeckbox.click();
			System.out.println("Unchecked now");
		}
		else {
			clickonthischeckbox.click();
			System.out.println("Checked now");
		}
	}
	public static void main(String[] args) {
		Checkbox checkbox=new Checkbox();
		checkbox.initializeBrowser();
		//checkbox.checkbox();
		//checkbox.isselected();
		checkbox.homework();
		//checkbox.driverQuitAndClose();

	}

}
