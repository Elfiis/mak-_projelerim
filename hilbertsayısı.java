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
public class hilbertsayısı {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz.");
        int s=input.nextInt();
        if((s-1)%4==0){
            System.out.println("hilbert sayısıdır.");
        }else{
            System.out.println("hilbert sayısı değildir.");
        }
    }
    
}
