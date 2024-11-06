package selenium.java.review;

public class child2seleniumjava extends parentseliniumjava {
    public void printit() {
    	//hierarchical inheritance
    	System.out.println(b);
    }
	public static void main(String[] args) {
		child2seleniumjava obj=new child2seleniumjava();
		obj.printit();
		obj.display();
		child1seleniumjava obj1=new child1seleniumjava();
		obj1.show();
		obj1.display(); //no need of this 'method call', just to show this child can also use its parents things

	}

}
