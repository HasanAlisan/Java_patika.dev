package BaslangicSeviye.Diziler;
import java.util.Scanner;
/*Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
*/

public class Pratik2DizidekiMaxMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        /*int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);*/


        int[] list = {15,12,788,1,-1,-778,2,0};
        int minClose=0, maxClose=0;

        System.out.print("bir sayı giriniz: ");
        int sayi=input.nextInt();

        for (int i : list) {
            if (i < sayi) {
                for (int j:list){
                    if(j>i&&j<sayi){
                        minClose=j;
                    }
                }
            }
        }

        for (int i : list) {
            if (i > sayi) {
                for (int j : list) {
                    if (j < i && j > sayi) {
                        maxClose = j;
                    }
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minClose);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxClose);


    }
}
