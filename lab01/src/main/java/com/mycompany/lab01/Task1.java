/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01;
import java.util.Scanner;
/**
 *
 * @author FATTANI COMPUTERS
 */
public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:(inches) : ");
        int inch = input.nextInt();
        
        double meters = inch*0.0254;
        System.out.println("the Values you entered"+ inch + "Is now converted into"+meters+"Meters");
        
        
    }
    
}
