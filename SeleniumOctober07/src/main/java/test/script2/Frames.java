package test.script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Frames extends Base {
	public void frame() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement frameimage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameimage.click();
	}

	public static void main(String[] args) {
		Frames frames=new Frames();
		frames.initializeBrowser();
		frames.frame();
		//frames.driverQuitAndClose();

	}

}
