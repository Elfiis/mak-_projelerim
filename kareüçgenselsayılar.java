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
public class kareüçgenselsayılar {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        int k0=0, k1=1;
        System.out.print(k1+",");
        for(int i=1; i<=n-1; i++){
        int k2=34*k1-k0+2;
            System.out.print(k2+",");
            k0=k1;
            k1=k2;
        }
    }
    
}
