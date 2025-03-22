
import java.util.Scanner;


public class InchToMeter{
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the value:(inches) : ");
      int inch = input.nextInt();
      double meters = (double)inch * 0.0254;
      System.out.println("The Value you Entered " + inch + "  is now converted into " +  meters  + "  Meters");
   }
}