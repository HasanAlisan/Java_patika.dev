package BaslangicSeviye.Metotlar;
import java.util.Scanner;
//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
// Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
// Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
//N Sayısı : 16
//Çıktısı : 16 11 6 1 -4 1 6 11 16

public class Odev3RecursiveDesenMetot {


    static int desenMetodu(int numberT)
    {
        int sonuc;
        System.out.print(numberT+" ");

        if(numberT<=0) return numberT;

        sonuc=5+desenMetodu(numberT-5);
        System.out.print(sonuc+" ");
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int numberT= input.nextInt();

        desenMetodu(numberT);

    }
}
