package selenium.java.review;

public class encapsulationchild {

	public static void main(String[] args) {
		encapsulationparent obj=new encapsulationparent();
		obj.setA(10);
		System.out.println(obj.getA());
		obj.setB("Hello");
		System.out.println(obj.getB());
		

	}

}
