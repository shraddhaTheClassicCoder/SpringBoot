import java.util.LinkedHashSet;
import java.util.Scanner;

public class FinalReverseWithoutUsingInbuiltFunction {

	public static void main(String[] args) {
	     
		 //Without Using In Built Function 
		 /*  String str = "Saket Saurav";
	        char chars[] = str.toCharArray();  
	        for(int i= chars.length-1; i>=0; i--) {
	            System.out.print(chars[i]);
	        }
	    }*/

		 
		 
		 //Using CharAt inbuilt function
	          //String original, reverse = "";
	        //System.out.println("Enter the string to be reversed");
	        //Scanner in = new Scanner(System.in);
	        //original = in.nextLine();
	        //int length = original.length();
	        //for(int i=length-1; i>=0; i--) {
	          //  reverse = reverse + original.charAt(i);  }
	        //System.out.println(reverse);
	    //}
	
		
		
		//Remove Duplicates
		 String input = "hello";
	        String result = removeDuplicates(input);
	        System.out.println("Original: " + input);
	        System.out.println("After removing duplicates: " + result);
		
	}
	public static String removeDuplicates(String str) {
        // Use LinkedHashSet to maintain the order and uniqueness of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Add characters to the set (duplicates will be automatically removed)
        for (char c : charArray) {
            set.add(c);
        }

        // Reconstruct the string without duplicates
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }

        return sb.toString();
    }
}
		 

