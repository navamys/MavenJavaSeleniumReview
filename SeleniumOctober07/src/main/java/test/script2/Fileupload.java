package test.script2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Fileupload extends Base{
	public void sendKeys() {
		driver.navigate().to("https://practice.expandtesting.com/upload#google_vignette");
		WebElement selectpdf=driver.findElement(By.xpath("//input[@id='fileInput']"));
		selectpdf.sendKeys("C:\\Users\\Navamy\\Downloads\\dummy-pdf.pdf"); //path double slash
		WebElement upload=driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		upload.click();
	}
	/*public void robotClass() {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection stringselection =new StringSelection("C:\\Users\\Navamy\\Downloads\\dummy-pdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null); //line for copy to clipboard
		Robot robot=new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); //paste ctrl+v 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
	}*/

	public static void main(String[] args)  {
		Fileupload fileupload=new Fileupload();
		fileupload.initializeBrowser();
		fileupload.sendKeys();
		//fileupload.robotClass();
		//fileupload.driverQuitAndClose();
	}

}
