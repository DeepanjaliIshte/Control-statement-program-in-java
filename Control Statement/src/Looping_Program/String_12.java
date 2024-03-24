//12. WAP to create Reverse String 


package Looping_Program;

public class String_12 {
	   public static void main(String[] args) {
	        String name = "Deepanjali";
	        String reversedStr = "";

	        for (int i = 0; i < name.length(); i++) {
	            char ch = name.charAt(i);
	            reversedStr = ch + reversedStr;
	        }

	        System.out.println("Original word: " + name);
	        System.out.println("Reversed word: " + reversedStr);
	    }
	}