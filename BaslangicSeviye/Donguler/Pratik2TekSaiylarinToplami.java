package BaslangicSeviye.Donguler;
import java.util.Scanner;
/*Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek
 sayıları toplayıp ekrana basan programı yazıyoruz.

Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün
katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/


public class Pratik2TekSaiylarinToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayiIn,toplam=0;

        /*  do
        {
            System.out.print("Bir sayı giriniz: ");
            sayiIn=input.nextInt();

            if (sayiIn%2!=0) toplam+=sayiIn;
        }
        while (sayiIn>0);

        System.out.println("Girilen sayılardan tek olanların toplamı:"+toplam);*/

        //ödev
        do
        {
            System.out.print("Bir sayı giriniz: ");
            sayiIn=input.nextInt();

            if (sayiIn%2==0 && sayiIn%4==0) toplam+=sayiIn;
        }
        while (sayiIn%2==0);
        System.out.println("Girilen sayılardan çift ve 4'ün katı olanların toplamı:"+toplam);
    }
}
