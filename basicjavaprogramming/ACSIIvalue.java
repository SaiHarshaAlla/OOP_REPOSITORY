package basicjavaprogramming;

import java.util.Scanner;

public class ACSIIvalue {

	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
	        String c = sc.next();
	        char ch = c.charAt(0);
	        int asciivalue = (int) ch;
	        System.out.println("ASCII value of character '" + ch + "' is " + asciivalue);

	    }
	}

}
