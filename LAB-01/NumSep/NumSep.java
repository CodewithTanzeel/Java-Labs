import java.util.Scanner;
public class NumSep{

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter three Digit Number:   ");
        int number= input.nextInt();
        int n1=number%10;
        int n2=number/10;
        int n3=number/100;
        int sum=n1+n2+n3;
        System.out.println("total sum: "+sum);
    }
}

