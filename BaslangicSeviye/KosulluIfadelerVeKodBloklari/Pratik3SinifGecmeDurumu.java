package BaslangicSeviye.KosulluIfadelerVeKodBloklari;


/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

import java.util.Scanner;

public class Pratik3SinifGecmeDurumu {
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

        int ortalama,dersAdedi=6;


        if(matematik<0||matematik>100) dersAdedi--;
        if(fizik<0||fizik>100) dersAdedi--;
        if(kimya<0||kimya>100) dersAdedi--;
        if(turkce<0||turkce>100) dersAdedi--;
        if(tarih<0||tarih>100) dersAdedi--;
        if(müzik<0||müzik>100) dersAdedi--;

        ortalama =(matematik+fizik+kimya+turkce+tarih+müzik)/dersAdedi;

        if(ortalama<=55) System.out.println("sınıfta kaldınız:");
        else System.out.println("sınıfı geçtiniz:");
        System.out.println("ortalamanız:"+ortalama);
    }
}
