package stringExample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("hello");
		System.out.println(s1);
		s1.append(" all");
		System.out.println(s1);
		s1.insert(0,"hey ");
		System.out.println(s1);
		s1.replace(0, 3,"good morning ");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.delete(0, 2);
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		
		StringBuilder s2=new StringBuilder();
		System.out.println(s2.capacity());

	}

}
