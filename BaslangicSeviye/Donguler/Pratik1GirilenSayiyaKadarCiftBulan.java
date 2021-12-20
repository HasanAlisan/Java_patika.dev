package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan
programı yazınız.*/


public class Pratik1GirilenSayiyaKadarÇiftBulan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayiIn,toplam=0,sayac=0;

        System.out.print("Sayi giriniz: ");
        sayiIn=input.nextInt();

        for (int i=1;i<=sayiIn;i++)
        {
            if (i%2==0) System.out.println(i+" çift sayidir");
        }

        for (int i=0;i<=sayiIn;i++)
        {
            if (i%3==0&&i%4==0)
            {

                toplam+=i;
                sayac++;
            }
        }
        System.out.println("Girilen sayıya kadar olan sayıların ortalaması:"+(toplam/sayac));


    }
}
