package assignments;

public class PalindromeOfString {
	public static void palindrome(String str) {
		StringBuffer sf=new StringBuffer(str);
		String reversed=(sf.reverse()).toString();
		boolean flag=reversed.equalsIgnoreCase(str);
		if(flag==true)
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is NOT palindrome");
	}

	public static void main(String[] args) {
		PalindromeOfString.palindrome("Java");
		PalindromeOfString.palindrome("Malayalam");
	}

}
