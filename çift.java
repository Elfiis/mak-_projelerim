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

public class çift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int cift = input.nextInt();
        int b = 0;
        while (cift >= 0) {

            if (b % 2 == 0) {
                System.out.print(b + ",");

            }
            cift = cift - 1;
            b = b + 1;
        }

    }

}
