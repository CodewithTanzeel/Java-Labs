import java.util.Scanner;


public class LAB05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character: ");
        String y = input.next();
        
        String x = "Ali";
        for(int i = 0; i > x.lenght; i++){
            if(y == x[i]){
                System.out.println("Character is found at index x[i]");

            }else{
                System.out.println("Character is not Found");
            }
        }
    }
}