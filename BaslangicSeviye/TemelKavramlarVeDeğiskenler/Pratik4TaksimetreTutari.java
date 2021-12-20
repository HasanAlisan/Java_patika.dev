package BaslangicSeviye.TemelKavramlarVeDeğiskenler;
import java.util.Scanner;

/*Taksimetre Programı

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
 */

public class Pratik4TaksimetreTutari {
    public static void main(String[] args) {
        int km,startPrice=10;
        float perKM=2.20f,tutar;

        Scanner input= new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi KM cinsinden giriniz: ");
        km=input.nextInt();

        tutar=startPrice+km*perKM;
        float ödenecekTutar= tutar>20?tutar:20.0f;
        System.out.println("ödenecek tutar: "+ödenecekTutar);
    }


}
