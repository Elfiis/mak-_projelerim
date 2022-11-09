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
public class tamsayınınkareleri {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir değer giriniz.");
        int x = input.nextInt();
        int a,b;
        for(a = 0;a<x;a++){
            for (b = 0;  b< x;b ++) {
                if (x==(a*a+b*b)) {
                    System.out.println(a+","+b); 
                }
    
            }
           
        }
    }
    
}
