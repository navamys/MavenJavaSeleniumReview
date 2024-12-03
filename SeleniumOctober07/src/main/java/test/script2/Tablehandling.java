package test.script2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.script.Base;

public class Tablehandling extends Base{
	public void printTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void printrRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		//here[1] is index of row ie first row, syntax is: table xpath/tbody/tr
		System.out.println(row.getText());
	}
	public void printCell() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[3]"));
		System.out.println(cell.getText());
	}
	public void printColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement i:column) {
			System.out.println(i.getText());
		}	
	}
	public void assignment3() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		String x="ashton cox";
		for(WebElement i:column) {
			String y=i.getText();
			if(x.equalsIgnoreCase(y)) {
				System.out.println("Element found is: "+ y +" and both are same");
			}
		}
	}
	public void assignment1() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row.getText());
		
	}
	public void assignment2() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[3]"));
		System.out.println(cell.getText());
	}

	public static void main(String[] args) {
		Tablehandling tablehandling=new Tablehandling();
		tablehandling.initializeBrowser();
		//tablehandling.printTable();
		//tablehandling.printrRow();
		//tablehandling.printCell();
		tablehandling.printColumn();
		//tablehandling.assignment1();
		//tablehandling.assignment2();
		//tablehandling.assignment3();
		//tablehandling.driverQuitAndClose();
		

	}

}
