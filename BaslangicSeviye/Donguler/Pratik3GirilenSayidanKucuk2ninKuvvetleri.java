package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

public class Pratik3GirilenSayidanKucuk2ninKuvvetleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayiIn,toplam4=1,toplam5=1;
        System.out.print("Bir sayı giriniz: ");
        sayiIn=input.nextInt();


        /*
        for (int i=1;i<=sayiIn;i++)
        {
            toplam*=2;
            System.out.println(" 2'nin "+i+ "nci kuvveti:" +toplam);
        }
        */

        for (int i=1;i<=sayiIn;i++)
        {
            toplam4*=4;
            toplam5*=5;
            System.out.println(" 4'nin "+i+ "nci kuvveti:" +toplam4);
            System.out.println(" 5'nin "+i+ "nci kuvveti:" +toplam5);
        }





    }
}
