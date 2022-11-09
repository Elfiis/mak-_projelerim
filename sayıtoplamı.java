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

public class sayıtoplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int a = input.nextInt();
        int b = 0;
        int c = 0;
        while (a > 0) {
            b = b + 1;
            c = c + b;
            a = a - 1;

        }
        System.out.println(c);

    }

}
