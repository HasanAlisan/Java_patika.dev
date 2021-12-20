package BaslangicSeviye.TemelKavramlarVeDegiskenler;
import java.util.Scanner;

/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL*/

public class Odev2ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double fiyat;

        System.out.print("Armut kaç kilo: ");
        armutKg= input.nextInt();
        System.out.print("Elma kaç kilo: ");
        elmaKg= input.nextInt();
        System.out.print("Domates kaç kilo: ");
        domatesKg= input.nextInt();
        System.out.print("Muz kaç kilo: ");
        muzKg= input.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        patlicanKg= input.nextInt();

        fiyat=((armutKg*2.14)+(elmaKg*3.67)+(domatesKg*1.11)+(muzKg*0.95)+(patlicanKg*5.0));
        System.out.print("Toplam tutar (TL): "+fiyat);
    }
}
