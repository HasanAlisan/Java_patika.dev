package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*Java ile faktöriyel hesaplayan program yazıyoruz.
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü

C(n,r) = n! / (r! * (n-r)!)*/


public class Pratik4FaktoriyelKombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayiN,sayiR,faktoriyelN=1,faktoriyelR=1,faktoriyelN_R=1;
        System.out.println("Kobinasyon= C(n,r) = n! / (r! * (n-r)!)");
        System.out.print(" -n- sayısını giriniz: ");
        sayiN=input.nextInt();
        System.out.print(" -r- sayısını giriniz: ");
        sayiR=input.nextInt();

        /*
        for(int i =1;i<=sayiIn;i++)
        {
            toplam*=i;
            System.out.print(i+"*");
        }
        System.out.println("\n"+sayiIn+" faktoriyel= "+toplam);
        */

        //kombinasyon
        for(int i =1;i<=sayiN;i++)
        {
            faktoriyelN*=i;
        }
        for(int i =1;i<=sayiR;i++)
        {
            faktoriyelR*=i;
        }

        for(int i =1;i<=(sayiN-sayiR);i++)
        {
            faktoriyelN_R*=i;
        }

        System.out.println("kombinasyon: "+(faktoriyelN/(faktoriyelR*faktoriyelN_R)));



    }
}
