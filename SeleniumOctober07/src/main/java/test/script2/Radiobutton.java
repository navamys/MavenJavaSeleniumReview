package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Radiobutton extends Base{
	//radiobutton methods are: click, isselected, isenabled, isdisplayed
	public void radiobutton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		WebElement showselectedvalue=driver.findElement(By.id("button-one"));
		showselectedvalue.click();
	}
	public void isselected() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		boolean fema=female.isSelected();
		System.out.println(fema);
	}
	public void isenabled() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean fema=female.isEnabled();
		System.out.println(fema);
	}
	public void isdisplayed() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean fema=female.isDisplayed();
		System.out.println(fema);
	}
	public void homework() {
		/*if am doing homework by using isselected method here and homework method here, 
		 I dont need the first navigation line of homework method as i already navigated 
		 in isselected method and continuation of it is happening in homework method  */
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//female.click();
		boolean femalee=female.isSelected();
		if(femalee==true) {
			System.out.println("Female radiobutton is already selected");
		}
		else {
			female.click();
			System.out.println("It was not selected, hence selected just now");
		}
	}

	public static void main(String[] args) {
		Radiobutton radiobutton=new Radiobutton();
		radiobutton.initializeBrowser();
		//radiobutton.radiobutton();
		//radiobutton.isselected();
		//radiobutton.isenabled();
		//radiobutton.isdisplayed();
		radiobutton.homework();
		//radiobutton.driverQuitAndClose();

	}

}
