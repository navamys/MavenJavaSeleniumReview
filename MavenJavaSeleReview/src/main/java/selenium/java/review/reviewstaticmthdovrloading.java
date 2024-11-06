package selenium.java.review;

public class reviewstaticmthdovrloading {
	public static void display() {
		System.out.println("without parameters");
	}
	public static void display(int a) {
		System.out.println("with integer as parameter: "+a);
	}
	public static void display(String b) {
		System.out.println("with String as parameter: "+b);
	}

	public static void main(String[] args) {
		reviewstaticmthdovrloading.display();
		reviewstaticmthdovrloading.display(15);
		reviewstaticmthdovrloading.display("Hello World");

	}

}
