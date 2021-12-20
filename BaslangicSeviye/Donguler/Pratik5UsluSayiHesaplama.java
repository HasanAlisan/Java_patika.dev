package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/

public class Pratik5UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayiN,sayiK,toplam=1;

        System.out.print("üssü alınacak sayı: ");
        sayiN=input.nextInt();
        System.out.print("üs olacak sayı: ");
        sayiK=input.nextInt();

        /*
        while (sayiK!=0)
        {
            toplam*=sayiN;
            sayiK--;
        }
        System.out.print("sonuç: "+toplam);
        */

        for(int i=sayiK;i!=0;i--) toplam*=sayiN;
        System.out.print("sonuç: "+toplam);

    }
}

