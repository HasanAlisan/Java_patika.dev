package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*
Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.*/

public class Pratik8YildizlardanUcgenElmasYapimi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("basamak sayısını giriniz:" );
        int rowN=input.nextInt();

        /*
        //üçgen
        for (int i = 0; i <= rowN ; i++) {
            for (int j = 0; j < (rowN - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */

        //elmas
        for (int i=1;i<=rowN;i++)
        {
            for(int j=1;j<=(rowN-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int a=rowN-1;a>=1;a--)
        {
            for (int b=1; b<=(rowN-a);b++)
            {
                System.out.print(" ");
            }
            for (int c=(2*a)-1;c>=1;c--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
