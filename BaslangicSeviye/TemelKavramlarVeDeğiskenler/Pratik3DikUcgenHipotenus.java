package BaslangicSeviye.TemelKavramlarVeDeğiskenler;
import java.util.Scanner;
/*
* Dik Üçgende Hipotenüs Bulan Program

Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül

Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
public class Pratik3DikUcgenHipotenus {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float a,b;
        System.out.print("dik üçgenin a kenarını giriniz: ");
        a= input.nextFloat();
        System.out.print("dik üçgenin b kenarını giriniz: ");
        b= input.nextFloat();

        double hipotenus,u,alan;
        hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println("üçgenin hipotenüsü: "+hipotenus + "\tbirim");

        //cevre=2*u;
        u=(a+b+hipotenus)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-hipotenus)) ;
        System.out.println("üçgenin alanı: "+alan +"\tbirim^2");


    }
}
