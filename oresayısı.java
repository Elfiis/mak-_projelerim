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
public class oresayısı {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz.");
        int a=input.nextInt();
        int s=0,t=0;
        for(int i=1;i<=a;i++){
        if(a%i==0){
        s++;
        t=t+1/i;
        }
        }
        int ho=s/t;
        System.out.println(ho);
        System.out.println("çıkan değer eğer bir tam sayı ise ORE sayısıdır.");
    }
    
}
