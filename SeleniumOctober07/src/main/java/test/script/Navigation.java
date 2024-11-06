package test.script;

public class Navigation extends Base {
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Navigation navigation =new Navigation();
		navigation.initializeBrowser();//first call this to launch
		navigation.navigationCommands();
		navigation.driverQuitAndClose();

	}

}
