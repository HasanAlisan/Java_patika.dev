package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*Ödev
hesap makinesini switch-case kullanarak yapınız.*/

public class Pratik1HesapMakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2, select;

        System.out.print("ilk sayıyı giriniz: ");
        n1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2= input.nextInt();

        System.out.println("1- toplama\n" +
                "2- çıkarma\n" +
                "3- çarpma\n" +
                "4- bölme");
        System.out.print("işleminiz: ");
        select= input.nextInt();

        switch (select)
        {
            case 1: System.out.print("toplama sonucu:"+(n1+n2));
                break;
            case 2:System.out.print("çıkarma sonucu:"+(n1-n2));
                break;
            case 3:System.out.print("çarpma sonucu:"+(n1*n2));
                break;
            case 4:System.out.print("bölme sonucu:"+(n1/n2));
                break;
        }

    }
}
