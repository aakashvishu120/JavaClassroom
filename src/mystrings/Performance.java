package mystrings;

public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accumulate = "";
		for(int i =0 ; i < 26 ; i++) {
			char ch = (char)('a' + i);
			accumulate += ch;
		}
		System.out.println(accumulate);
	}
	
	//Takes lots of Memory , every time create a new string var then copy previous value and add current value o(n^2)
	//use string builder instead
}
