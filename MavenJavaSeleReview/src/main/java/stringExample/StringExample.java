package stringExample;

public class StringExample {

	public static void main(String[] args) {
		String s1="Welcome"; //by literal
		String s2=new String("Welcome"); //by new keyword
		String s3="hello";
		String s4="welcome";
		System.out.println(s1);
		System.out.println(s2);
		int x=s1.length(); System.out.println(x);
		System.out.println(s1.length());
		s1=s1.concat(" all");
		System.out.println(s1);
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2)); //it checks only reference, not case sensitive or not word specific
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s2)); 
		System.out.println(s1.charAt(0)); 
		System.out.println(s2.charAt(3));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s3.replace("hello","hi"));
		System.out.println(s3.startsWith("he"));
		System.out.println(s3.endsWith("he")); 
		int a=10;
		String s5=String.valueOf(a);
		System.out.println(s5+"20");
		String s6="Good morning all";
		System.out.println(s6.contains("all"));
		System.out.println(s6.contains("hey"));
	}

}
