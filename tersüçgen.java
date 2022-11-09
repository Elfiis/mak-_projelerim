/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elfis
 */
import java.util.Scanner;
public class tersüçgen {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("bir değrer giriniz"); 
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = x; j >i ; j--) {
                
          System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
