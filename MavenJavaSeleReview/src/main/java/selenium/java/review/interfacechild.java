package selenium.java.review;

public class interfacechild implements interfaceparent,interfaceparent1 {
	public void display() {
		System.out.println("displaying integer: "+VALUE);
	}
	public void show() {
		System.out.println("showing string: "+STR);
	}
	public static void main(String[] args) {
		interfacechild obj=new interfacechild();
		obj.display();
		obj.show();

	}

}
