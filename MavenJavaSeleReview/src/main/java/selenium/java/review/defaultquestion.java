package selenium.java.review;

public class defaultquestion {
	String a;
	int b;

	public defaultquestion(String a,int b) {
		this.a=a;
		this.b=b;
		this.printit();
	}
	public void printit() {
		
		System.out.println("String is: "+a);
		System.out.println("Integer is: "+b);
	}

	public static void main(String[] args) {
		defaultquestion obj=new defaultquestion("hello",18);
		

	}

}
