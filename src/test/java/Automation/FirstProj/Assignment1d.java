package Automation.FirstProj;

public class Assignment1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fahad";
		
		String reversedString = reverseString(s);
		System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversedString);
		

	}

	private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
		
	    }
	}


