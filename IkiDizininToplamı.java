
import java.util.Scanner;
import java.util.Random;

public class IkiDizininToplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rst = new Random();
        System.out.println("dizinin eleman sayısını giriniz.");
        int a = input.nextInt();
        System.out.println("dizinin elemanlarının alacağı değerlerin üst sınırını giriniz.");
        int x = input.nextInt();
        dizitop(a, x);
    }

    public static void dizitop(int elemans, int aralık) {
        Random rst = new Random();
        int[][] a = new int[elemans][elemans];
        int[][] b = new int[elemans][elemans];
        int[][] c = new int[elemans][elemans];
        for (int i = 0; i < elemans; i++) {
            for (int j = 0; j < elemans; j++) {
                a[i][j] = rst.nextInt(aralık);
                b[i][j] = rst.nextInt(aralık);
                System.out.print(a[i][j] + ",");
                System.out.print(b[i][j] + ",");
            }
        }
        System.out.println("");
        System.out.println("dizi toplam: ");
        for (int i = 0; i < elemans; i++) {
            for (int j = 0; j < elemans; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+",");
            }
        }
    }
}
