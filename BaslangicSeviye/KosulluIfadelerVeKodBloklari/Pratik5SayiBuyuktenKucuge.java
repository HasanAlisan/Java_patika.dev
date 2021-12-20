package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

//Ödev
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

public class Pratik5SayiBuyuktenKucuge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi1,sayi2,sayi3;
        System.out.print("1. sayıyı giriniz: ");
        sayi1= input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2= input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        sayi3= input.nextInt();


        /* Büyükten küçüğe
        * if ((sayi1>sayi2)&&(sayi1>sayi3))
        {
            if(sayi2>sayi3)
                System.out.print("sayi1 > sayi2 > sayi3");
            else
                System.out.print("sayi1 > sayi3 > sayi2");
        }
        else if ((sayi2>sayi1)&&(sayi2>sayi3))
        {
            if(sayi1>sayi3)
                System.out.print("sayi2 > sayi1 > sayi3");
            else
                System.out.print("sayi2 > sayi3 > sayi1");
        }
        else // ((sayi3>sayi1)&&(sayi3>sayi2))
        {
            if(sayi1>sayi2)
                System.out.print("sayi3 > sayi1 > sayi2");
            else
                System.out.print("sayi3 > sayi2 > sayi1");
        }
        * */

        // küçükten büyüğe
        if ((sayi1>sayi2)&&(sayi1>sayi3))
        {
            if(sayi2>sayi3)
                System.out.print("sayi3 < sayi2 < sayi1");
            else
                System.out.print("sayi2 < sayi3 < sayi1");
        }
        else if ((sayi2>sayi1)&&(sayi2>sayi3))
        {
            if(sayi1>sayi3)
                System.out.print("sayi3 < sayi1 < sayi2");
            else
                System.out.print("sayi1 < sayi3 < sayi2");
        }
        else // ((sayi3>sayi1)&&(sayi3>sayi2))
        {
            if(sayi1>sayi2)
                System.out.print("sayi2 < sayi1 < sayi3");
            else
                System.out.print("sayi1 < sayi2 < sayi3");
        }


    }
}
