package mystrings;

public class MyPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aakash";
		String str2 = "naman";
		System.out.println(str + " " + isPalindrome(str));
		System.out.println(str2 + " " + isPalindrome(str2));
	}
	
	static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		for(int i =0 ; i < str.length() - 1 ; i++) {
			char startIndex = str.charAt(i);
			char endIndex = str.charAt(str.length() - 1 - i );
			
			if(startIndex != endIndex) {
				return false;
			}
		}
		return true;
	}

}
