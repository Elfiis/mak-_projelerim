/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class cosxfonksiyonu {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("x değerini giriniz.");
        int x=input.nextInt();
        System.out.println("n değerini giriniz.");
        int n=input.nextInt();
        int t=1;
        for(int i=1;i<n-1; i++){
        int f=1;
        for(int j=1;j<2*i-1;j++){
        f*=j;
        }
        t=(int)(t+(Math.pow(-1, i)*Math.pow(x,2*i))/f);
        }
        System.out.println("sonuç:\t"+t);
    }
    
}
