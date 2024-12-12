package assignments;

public class ReverseOfString {

	public static void main(String[] args) {
		int i;
		char character;
		String reverse="";
		String s="Navamy S";
		for(i=s.length()-1;i>=0;i--) {
			character=s.charAt(i);
			reverse=reverse+character;
		}
		System.out.print("Reversed String is: "+reverse);
	}

}
