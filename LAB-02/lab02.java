import java.util.Scanner;
public class LAB2 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        //Task01
        /*Create a Java application for a basic calculator with the following capabilities:
        Addition and Subtraction
        Division, Exponentiation, and Multiplication
        */
        /*
        System.out.println("Enter first number :");
        int num1=input.nextInt();
        System.out.println("Enter second number :");
        int num2=input.nextInt();
        System.out.println("Enter operation:");
        String operator=input.next();

        double result;
        switch (operator) {
            case "+":
                result=(int)num1+num2;
                System.out.println(num1+operator+num2+"="+result);
                break;
            case "-":
                result=(int)num1-num2;
                System.out.println(num1+operator+num2+"="+result);
                break;        
            case "*":
                result=(int)num1*num2;
                System.out.println(num1+operator+num2+"="+result);
                break;
            case "/":
                result=num1+num2;
                System.out.println(num1+operator+num2+"="+result);
                break;
            case "**":
                result=Math.pow(num1,num2);
                System.out.println(num1+operator+num2+"="+result);
                break;
            default:
                System.out.println("Sorry there must be some mistake.");
                break;
        }*/



        //Task02
        /*B.	To convert temperature from Celsius to Fahrenheit, write a Java program

        Guidelines:
        Asking for the temperature in Celsius will prompt the user.
        Check the temperature that the user has entered.
        Use this formula to convert the temperature from Celsius to Fahrenheit: Degrees Celsius * (9/5) + 32 = Fahrenheit
        */
        /* 
        System.out.println("Enter value in calcsius:");
        double Celsius=input.nextDouble();
        double Fahrenheit=Celsius*(9/5)+32;
        System.out.println("The given celsius "+Celsius+" C converted into fahrenheit "+Fahrenheit+" F.");*/
        

        //Task03
        /*System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Initial value: " + number);
        System.out.println("After pre-increment (++number): " + (++number));
        System.out.println("After post-increment (number++): " + (number++));
        System.out.println("Value after post-increment: " + number);
        System.out.println("After pre-decrement (--number): " + (--number));
        System.out.println("After post-decrement (number--): " + (number--));
        System.out.println("Value after post-decrement: " + number);     
        */
        
        
    }
    
}