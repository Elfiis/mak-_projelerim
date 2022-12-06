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
public class Basamaksayısınagörepolindrom {

    
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("basamak sayısını giriniz.");
        int n=input.nextInt();
        System.out.println(n+"\tbasamaklı\t"+(Math.pow(9*10,(n-1)/2))+"\ttane polindrom sayısı bulunmaktadır.");
    }
    
}
