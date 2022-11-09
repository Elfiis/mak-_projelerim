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
public class vizenothesap {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double vize;
        double finall;
        do{
            System.out.println("vize notunu giriniz.");
            vize=input.nextInt();
        } while (vize<=0 && vize>=100);
        do{
            System.out.println("final notunu giriniz.");
            finall=input.nextInt();
        } while (finall<=0 && finall>=100);
        double ortalama = (double) ((vize*(0.4))+(finall*(0.6)));
        System.out.println("ortalamanız:"+ortalama);
        if(80<ortalama && ortalama<80){
            System.out.println("Harf notunuz A");
        }else if(60<ortalama && ortalama<80){
            System.out.println("Harf notunuz B");
        }else if(40<ortalama && ortalama<60){
            System.out.println("Harf notunuz C");
        }else if(20<ortalama && ortalama<40){
            System.out.println("Harf notunuz D");
        }
    
               
                
                
                
                
                
                
                
                }

}
