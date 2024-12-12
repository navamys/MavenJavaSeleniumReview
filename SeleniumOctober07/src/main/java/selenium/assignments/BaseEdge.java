package selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseEdge {
	public WebDriver driver;
	public void initializeBrowser() {
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
	}

	public static void main(String[] args) {
		BaseEdge obj=new BaseEdge();
		obj.initializeBrowser();

	}

}
