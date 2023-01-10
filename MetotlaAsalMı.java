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
public class MetotlaAsalMı {

  
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        boolean sonuc = AsalMi(input.nextInt());
        
        System.out.println(sonuc);
        

    }
    
    public static boolean AsalMi(int sayi){
    
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                return false;
            }
        }
        return true;
    }
    
}
