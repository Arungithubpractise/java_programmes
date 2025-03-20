package Scanner_class_programees;

import java.util.Scanner;

public class WordCounter {
	
		    public static void main(String[] args) 
		    {
		        Scanner scan = new Scanner(System.in);
		        int count = 0;

		        // Prompt user to enter the word to search
		        System.out.println("Enter word to find in the sentence:");
		        String word = scan.next();

		        // Prompt user to enter the sentence
		        scan.nextLine(); // Consume the newline character
		        System.out.println("Enter the sentence:");
		        String sentence = scan.nextLine();

		        // Split the sentence into words
		        String[] words = sentence.split(" ");

		        // Count occurrences of the word
		        for (String w : words) {
		            if (w.equals(word)) {
		                count++;
		            }
		        }

		        // Print the final count
		        System.out.println("The word '" + word + "' appears " + count + " times in the sentence.");
		    }
		

}


