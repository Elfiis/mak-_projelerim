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
public class sıfırdoksandokuzarasıfibonaççi {

    
    public static void main(String[] args) {
        for (int i=0;i<=9;i++){
        for (int j=0;j<=9;j++){
        int s=i+j;
        if (s==1|| s==2 || s==3|| s==5|| s==8||s==13){
            System.out.print((10*i+j)+",");
        }
        }
        }
    }
    
}
