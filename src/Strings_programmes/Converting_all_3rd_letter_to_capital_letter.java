package Strings_programmes;
public class Converting_all_3rd_letter_to_capital_letter {

    public static void main(String[] args) 
    {
        String input = "hello     "
        		+ "world from a java";
        
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }
        

        String[] str = input.split("\\s+");
        

        for (int i = 0; i < str.length; i++) 
        {
            if (str[i].length() >= 3) 
            {
                str[i] = str[i].substring(0, 2) + str[i].substring(2, 3).toUpperCase() + str[i].substring(3);
            }
        }

        for (String word : str) {
            System.out.print(word + " ");
    }
}
}