package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Alerthandling extends Base{
	//Alert interface provides methods like: accept(), dismiss(), getText(), sendKeys()
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement greenbutton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		greenbutton.click();
		//String alerttext=driver.switchTo().alert().getText(); //to fetch texts inside alert
		//System.out.println(alerttext); //either both 14 and 15 or use 16 only 
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //to switch to popup since alert is not a html element
	}
	public void promptAlert() {
		//driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//WebElement redbutton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		WebElement x=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		x.click();
		//redbutton.click();
		//driver.switchTo().alert().sendKeys("Navamy");
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement yellowbutton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		yellowbutton.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	

	public static void main(String[] args) {
		Alerthandling alerthandling =new Alerthandling();
		alerthandling.initializeBrowser();
		//alerthandling.simpleAlert();
		alerthandling.promptAlert();
		//alerthandling.confirmationAlert();
		//alerthandling.driverQuitAndClose();

	}

}
