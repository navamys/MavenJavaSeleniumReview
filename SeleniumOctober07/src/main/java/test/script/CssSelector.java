package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {
	public void tagAndId() {
		//syntax: driver.findElement(By.cssSelector("tag#id"));
		//check for duplicate by tagname#idname(Eg:"button#button-one") in ctrl+F.
		WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
		WebElement element2=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element3=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		WebElement element4=driver.findElement(By.cssSelector("a#progress-bars"));
	}
	public void tagAndClass() {
		//syntax: driver.findElement(By.cssSelector("tagname.classname"));
		//check for duplicate by tag.class(Eg:"footer.mt-5") in ctrl+F.
		WebElement element5=driver.findElement(By.cssSelector("footer.mt-5"));
		WebElement element6=driver.findElement(By.cssSelector("div.header-top"));
		WebElement element7=driver.findElement(By.cssSelector("a.navbar-brand"));
	}
	public void tagAndAttribute() {
		//syntax: driver.findElement(By.cssSelector("tagname[attribute='value']"));
		WebElement element8=driver.findElement(By.cssSelector("button[id='button-one']"));
	}
	public void tagAndClassAndAttribute() {
		//syntax: driver.findElement(By.cssSelector("tagname.classname[attribute='value']"));
		WebElement element9=driver.findElement(By.cssSelector("button.navbar-toggler[type='button']"));
		WebElement element10=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
		WebElement element11=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
	}

	public static void main(String[] args) {
		CssSelector cssselector=new CssSelector();
		cssselector.initializeBrowser();
		cssselector.tagAndId();
		cssselector.tagAndClass();
		cssselector.tagAndAttribute();
		cssselector.tagAndClassAndAttribute();
		cssselector.driverQuitAndClose();
		

	}

}
