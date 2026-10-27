/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
        
public class NO_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer number:");
        int num1 = input.nextInt();
        
        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter an operator (+, - , *, /, %):");
        char op = input.next().charAt(0); // It reads what the user types as a String 
        //and keeps only its first character, so the program can check which operator 
        //(+, -, *, /, %) was entered.
        
        switch (op) {
            case '+' :
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
                
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
                
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
                
             case '/':
                if (num2 == 0) {
                    System.out.println("Error: division by zero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: division by zero.");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operator: " + op);
        }
        }
        
    }

