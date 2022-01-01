package mypackage;

public class Hello {

	public static void main(String[] args) {
		String original = "Sanju";
		String reverse = "";
		char ch;
		System.out.println("The Original String: "+original);
		for(int i = 0; i<original.length(); i++) {
			ch = original.charAt(i);
			reverse = ch+ reverse;
		}
		System.out.println("Reversed String is: "+reverse);

	}

}
