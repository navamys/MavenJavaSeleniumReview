package selenium.java.review;

public class overloading {
	public void display() {
		System.out.println("printing display");
	}
	public void display(String a) {
		System.out.println("a is: "+ a);
	}
	public void display(int b) {
		System.out.println("b is: "+ b);
	} 

	public static void main(String[] args) {
		overloading obj=new overloading();
		obj.display();
		obj.display("Hello");
		obj.display(10);

	}

}
