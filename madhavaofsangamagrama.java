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
public class madhavaofsangamagrama {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısını giriniz");
        int n=input.nextInt();
        int t=0;
        for(int k=0;k<n-1;k++){
        t=(int)(t+Math.pow(-1, k/((2*k+1)*Math.pow(3, k))));
        
        }
        System.out.println("sonuç:\t"+(int)(Math.pow(12, (1/2)*t)));
    }
    
}
