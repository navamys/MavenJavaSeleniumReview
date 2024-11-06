package test.script;

public class Browsercommands extends Base {
	public void BrowserComd() {
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		Browsercommands browsercommands=new Browsercommands();
		browsercommands.initializeBrowser();
		browsercommands.BrowserComd();
		browsercommands.driverQuitAndClose();

	}

}
