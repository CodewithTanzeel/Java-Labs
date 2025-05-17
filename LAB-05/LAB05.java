import java.util.Scanner;


public class LAB05{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your character: ");
//         String y = input.nextLine();

//         if (y.length() != 1) {
//             System.out.println("Please enter exactly one character.");
//             return;
//         }
//         char searchChar = y.charAt(0);

//         String x = "Ali";
//         boolean found = false;

//         for (int i = 0; i < x.length(); i++) {
//             if (searchChar == x.charAt(i)) {
//                 System.out.println("Character '" + searchChar + "' is found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Character is not Found");
//         }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine();
    
    for (int i = 0; i < word.length(); i++) {
        char current = word.charAt(i);
        boolean unique = true;
        
        for (int j = 0; j < word.length(); j++) {
            if (i != j && current == word.charAt(j)) {
                unique = false;
                break;
            }
        }
        
        if (unique) {
            System.out.println("First unique character: " + current);
            return;
        }
    }
    System.out.println("All characters repeat");
}
}