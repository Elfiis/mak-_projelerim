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
public class polinom {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("dizinin elman sayısını giriniz.");
        int n = input.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("eleman sayısını girmiş olduğunuz dizinin " + (i + 1) + " inci elemanın değerini giriniz.");
            int y = input.nextInt();
            dizi[i]=y; 
        }
        System.out.println("elemanlarını girmiş olduğunuz dizi ile oluştumuş olduğunuz polinom fonksiyonunun"
                + "x değerini atayınız.");
        
        int x = input.nextInt();
        int pf = 0;
        for (int i = 0; i <n; i++) {
            pf += (int) (dizi[i]*Math.pow(x, i));
        }
        System.out.println("polinom fonksiyonunuzun sonucu: "+pf);
    }
    
}
