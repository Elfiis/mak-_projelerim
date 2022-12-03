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
public class negatiffibonaççi {
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("terim sayısını giriniz.");
        int n=input.nextInt();
        int f1=1 ,f2= -1;
        
        System.out.print(f1+","+f2+",");
        for(int i=1;i<=n-2;i++){
            int f3 = f1-f2;
            System.out.print(f3+",");
        f1=f2;
        f2=f3;
        }
    }
    
}
