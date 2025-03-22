import java.util.Scanner;
public class BioData {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name:");
        String Name=input.next();
        System.out.println("Enter your father name:");
        String Fname=input.next();
        System.out.println("Enter your age:");
        String Age =input.next();
        System.out.println("Enter your gender:");
        String Gender=input.next();
        System.out.println("Enter your email:");
        String Email=input.next();
        System.out.println("Hello"+Name+"nice to meet");
        System.out.println("Father's name: "+Fname);
        System.out.println("Gender : "+Gender);
        System.out.println("Age : "+Age);
        System.out.println("email : "+Email);
    }
}
