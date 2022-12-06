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
public class leylandsayıları {
    
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("x sayısını giriniz.");
        int x=input.nextInt();
        System.out.println("y sayısını giriniz.");
        int y=input.nextInt();
        for(int i=2 ; i<=x; i++){
        for(int j=2;j<=y;j++){
            System.out.print((int)(Math.pow(i,j)+Math.pow(j, i))+",");
        }
        }
    }
    
}
