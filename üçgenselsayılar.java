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
public class üçgenselsayılar {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim saysını giriniz.");
        int n =input.nextInt();
        for(int i=1;i<=n;i++){
        int u=i*(i+1)/2;
            System.out.print(u+",");
        
        }
    }
    
}
