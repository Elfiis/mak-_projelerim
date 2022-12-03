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
public class tausayısı {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n=input.nextInt();
        for (int i=1;i<=n;i++){
         int s=0;
         for(int j =1;j<=i;j++){
        if(i%j==0){
        s++;
        }
        }
         if(i%s==0){
             System.out.print(i+",");
         }    
        
        
        
        }
    }
    
}
