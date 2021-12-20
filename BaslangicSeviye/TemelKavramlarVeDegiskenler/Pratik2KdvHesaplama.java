package BaslangicSeviye.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
/*
* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
*
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
*
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
* KDV tutarı hesaplayan programı yazınız.*/

public class Pratik2KdvHesaplama {
    public static void main(String[] args) {
    float tutar, KDVORANI;
    Scanner input = new Scanner(System.in);
    System.out.print("tutar miktarını giriniz: ");
    tutar= input.nextFloat();
    KDVORANI= ((tutar>=0)&&(tutar<=1000))?0.18f:0.08f;

    float kdvTutari=tutar*KDVORANI;
    float kdvliTutar=tutar+kdvTutari;
    System.out.println("kdv tutarınız: "+kdvTutari);
    System.out.println("kdv'li tutarınız: "+kdvliTutar);


    }
}
