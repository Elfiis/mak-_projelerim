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
public class etkinlik2 {

   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int row;
        do {
            System.out.println("satır sayısını giriniz.");
            row = input.nextInt();
        } while (row < 0);

        int bosluk_sayac = row-1;
        for (int i = 1; i <=row ; i++) {
            for (int j = 0; j <= bosluk_sayac ; j++) {
                System.out.print(" ");
            }for (int j = 1; j <=row-bosluk_sayac; j++) {
                System.out.print("*");
            }
            bosluk_sayac--;
            System.out.println();
        }
    }
    
}
