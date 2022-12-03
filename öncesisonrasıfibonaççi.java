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
public class öncesisonrasıfibonaççi {

   
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        System.out.println("bir fibonaççi sayısı giriniz.");
        int f2=input.nextInt();
        double ao =(1+ Math.pow(5, .5))/2;
        int f1=(int)(f2/ao);
        int f3=(int)(f2*ao);
        System.out.println(f1+","+f2+","+f3);
        
                } 
}
