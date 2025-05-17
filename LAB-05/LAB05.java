import java.util.Scanner;


public class LAB05{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character: ");
        String y = input.nextLine();

        if (y.length() != 1) {
            System.out.println("Please enter exactly one character.");
            return;
        }
        char searchChar = y.charAt(0);

        String x = "Ali";
        boolean found = false;

        for (int i = 0; i < x.length(); i++) {
            if (searchChar == x.charAt(i)) {
                System.out.println("Character '" + searchChar + "' is found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Character is not Found");
        }
}