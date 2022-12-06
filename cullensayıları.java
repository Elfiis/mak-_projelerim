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
public class cullensayıları {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n= input.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print((int)Math.pow(i*2,i+1)+",");
        }
    }
    
}
