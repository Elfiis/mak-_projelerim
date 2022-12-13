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
public class pozitifnegatifdizi {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Dizi uzunluğunu giriniz");
        int n = input.nextInt();
        int[] A = new int[n];
        int s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Eleman sayısını belirlemiş olduğunuz dizinin " + (i + 1) + "inci elemanın değerini giriniz.");
            int x = input.nextByte();
            A[i] = x;
            if (x > 0) {
                s++;
            }
            if (x < 0) {
                s2++;
            }
        }
        int[] B = new int[s];
        int[] C = new int[s2];
        int y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {

            } else if (A[i] > 0) {
                B[y] = A[i];
                y++;
            } else {
                C[z] = A[i];
                z++;

            }
        }
        System.out.print("a dizisinin elemanları: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println(" ");
        System.out.print("b dizisinin elemanları: ");
        for (int i = 0; i < s; i++) {
            System.out.print(B[i] + ",");
        }
        System.out.println(" ");
        System.out.print("c dizisinin elemanları: ");
        for (int i = 0; i < s2; i++) {
            System.out.print(C[i] + ",");
        }
  
    }
    
}
