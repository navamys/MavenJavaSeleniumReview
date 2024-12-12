package stringExample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
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
		
		
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());
		StringBuffer s3=new StringBuffer("hi");
		System.out.println(s3.capacity());
		s3.ensureCapacity(20);
		s3.append("hello");
		System.out.println(s3.capacity());
	}

}
