/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */

import java.util.Random;
        
public class NO_4 {
    public static void main(String[] args) {
        Random dice = new Random();
        
        // Player 1 rolls twice
        
        int p1Roll1 = dice.nextInt(6) + 1;
        int p1Roll2 = dice.nextInt(6) + 1;
        int p1Score = p1Roll1 + p1Roll2;
        
        // Player 2 rolls twice
        int p2Roll1 = dice.nextInt(6) + 1;
        int p2Roll2 = dice.nextInt(6) + 1;
        int p2Score = p2Roll1 + p2Roll2;
        
  System.out.println("Player 1 rolled " + p1Roll1 + " and " + p1Roll2 + " = " + p1Score);
        System.out.println("Player 2 rolled " + p2Roll1 + " and " + p2Roll2 + " = " + p2Score);
 
        if (p1Score > p2Score) {
            System.out.println("Player 1 wins!");
        } else if (p2Score > p1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}