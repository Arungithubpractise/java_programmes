package Strings_programmes;
public class Converting_all_2nd_letter_to_capital_letter {

    public static void main(String[] args)
       {
        String input = "hello world from a java";

        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) 
        {
            if (words[i].length() > 1) // Check if word length is greater than 1
            { 
                // Capitalize the second letter and keep the rest the same
            	
                words[i] = words[i].substring(0, 1) + words[i].substring(1, 2).toUpperCase() + words[i].substring(2);
            }
        }
        

  	  for (String word : words) {
            System.out.print(word + " ");

//        String result = String.join(" ", words);
//        System.out.println(result);
    }
}
}