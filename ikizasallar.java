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
public class ikizasallar {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("üst sınırı giriniz.");
        int n =input.nextInt();
        int s=0;
        for(int i=3; i<=n;i++){
        int k =0,a1=0,a2=0;
        for(int j=2;j<=i-1;j++){
        if(i%j==0){
           k++;
        }if(k==0){
           s++;
        }
        }
        }
    }
    
}
