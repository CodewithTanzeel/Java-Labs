import java.util.Scanner;
public class BMI {

    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter weight : ");
        double weight=input.nextDouble();
        System.out.println("Enter inches:");
        int inches=input.nextInt();
        double HFT=inches*0.0254;
        double KilloGram=weight*0.45359237;
        double BMI=KilloGram/HFT*HFT;
        System.out.println(" YOUR BMI IS: "+BMI);
    }
}
..
