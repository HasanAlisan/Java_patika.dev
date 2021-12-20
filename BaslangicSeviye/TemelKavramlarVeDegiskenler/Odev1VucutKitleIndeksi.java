package BaslangicSeviye.TemelKavramlarVeDegiskenler;
import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)*/

public class Odev1VucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        float boy,kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy= input.nextFloat();
        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz:");
        kilo= input.nextFloat();

        System.out.print("Vücut kitle endeksiniz:"+(kilo/(boy*boy)));



    }
}
