package BaslangicSeviye.Donguler;
import java.util.Scanner;
public class Odev5Fibonacci {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz.
        // Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        //9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        Scanner input=new Scanner(System.in);
        System.out.print("Hesaplanacak Fibonacci Sayısını Giriniz: ");
        int numberFib = input.nextInt();

        int n0=0,n1=1,n2=0;
        System.out.print(n0+" "+n1);
        for (int i=2;i<numberFib;i++)
        {
            n2=n0+n1;
            System.out.print(" "+n2);
            n0=n1;
            n1=n2;

        }


    }
}
