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
public class skalerçarpım {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz");
        int n = input.nextInt();
       int [] a = new int [n];
       int [] b = new int [n];
        int sc = 0;
       for (int i = 0; i < n; i++) {
           System.out.println("A dizisinin\t"+(i+1)+"\tinci elemanını gir.");
           a[i]= input.nextInt();
           System.out.println("B dizisinin\t"+(i+1)+"\tinci elemanını gir.");
           b[i]= input.nextInt();
      }
        for (int i = 0; i <n; i++) {
            sc += a[i]*b[i];
        }
        System.out.println("Dizilerin skaler çarpımları sonucu:\t"+sc);
    }
    }
    

