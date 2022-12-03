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
public class floydüçgeni {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.");
        int x= input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        int s=1;
        for(int i=1; i<=x;i++){
        for (int j=1;j<=i; j++){
            System.out.print(s+",");
            s++;
        }
            System.out.println(" ");
        }
              
                }
    
}
