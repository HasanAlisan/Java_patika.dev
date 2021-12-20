package BaslangicSeviye.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class Pratik1NotOrtalamasiHesaplama {
//Not Ortalaması Hesaplayan Program
//
//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
// ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

//Ödev
//Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
// 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
//Not : If ve Else kullanılmayacak...

    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce, tarih,müzik;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik noturnu giriniz:");
        matematik= input.nextInt();
        System.out.print("Fizik noturnu giriniz:");
        fizik= input.nextInt();
        System.out.print("Kimya noturnu giriniz:");
        kimya= input.nextInt();
        System.out.print("Türkçe noturnu giriniz:");
        turkce= input.nextInt();
        System.out.print("Tarih noturnu giriniz:");
        tarih= input.nextInt();
        System.out.print("Müzik noturnu giriniz:");
        müzik= input.nextInt();

        int ortalama =(matematik+fizik+kimya+turkce+tarih+müzik)/6;
        System.out.println("ortalamanız:"+ortalama);

        String sınıfDurumu  = ortalama>60?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("sınıfDurumu:"+sınıfDurumu);

    }

}
