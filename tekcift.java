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

public class tekcift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int tek = input.nextInt();
        int b = 0;
        while (tek > 0) {
            b = b + 1;
            if (b % 2 != 0) {
                System.out.print(b + ",");
            }
            tek = tek - 1;

        }

    }

}
