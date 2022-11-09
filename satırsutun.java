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
public class satırsutun {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
   
     
     
     
     System.out.println("satır sayısı giriniz.");   
     int a = input.nextInt();
      System.out.println("sütun sayısını giriniz.");
      int b = input.nextInt();
      for(int j = 1; j<=b;j++){
          for (int i = 1; i <=a; i++) {
              System.out.print("x");
          }
          System.out.println();
      }
        
       
     
   
    
    
    
    
    
    }
      
     
}
