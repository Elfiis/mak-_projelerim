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
public class bağdaşıksayılar {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("iki basamaklı a doğal sayısını giriniz.");
         int a=input.nextInt();
         System.out.println("iki basamaklı b doğal sayısını giriniz.");
         int b=input.nextInt();
         int a1=a/10;
         int b1=b/10;
         int a0=a%10;
         int b0=b%10;
         if (a1==b1 && a0+b0==10){
             System.out.println("bağdaşık sayılardır.");
         }else{
             System.out.println("bağdaşık sayı değildir.");
         }
         
                 
    }
    
}
