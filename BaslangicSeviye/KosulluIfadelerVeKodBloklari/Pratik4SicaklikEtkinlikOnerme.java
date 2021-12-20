package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

public class Pratik4SicaklikEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sicaklik;
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik= input.nextInt();

        String etkinlik;
        etkinlik=sicaklik<=5?"Kayak":(sicaklik>5&&sicaklik<=15)?"Sinema":(sicaklik>15&&sicaklik<=25)?"Piknik":"Yüzme";
        System.out.print("etkinlik tavsiyesi: "+etkinlik);


    }
}
