package BaslangicSeviye.TemelKavramlarVeDegiskenler;
import java.util.Scanner;

/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

public class Pratik5DaireAlaniVeÇevre {
    public static void main(String[] args) {

        float r, alan, cevre, pi=3.14f;

        Scanner input=new Scanner(System.in);
        System.out.print("üçgenin yarı çapını \'r\' giriniz:");
        r= input.nextFloat();

        /*alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("üçgenin alanı:"+ alan);
        System.out.println("üçgenin cevresi:"+ cevre);*/


        float alfa,daireDilimininAlanı;
        System.out.print("üçgenin merkez açısının ölçüsünü (derece) giriniz:");
        alfa=input.nextFloat();
        daireDilimininAlanı=(pi*(r*r)*alfa)/360;

        System.out.println("daire diliminin alanı: "+daireDilimininAlanı);


    }
}
