package BaslangicSeviye.Donguler;
import java.util.Scanner;

//Java ile girilen sayının harmonik serisini bulan program yazacağız.

public class Pratik7HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int numberIn;
        float sum=0.0f;
        System.out.print("Bir sayı giriniz: ");
        numberIn=input.nextInt();

        for(int i=1;i<=numberIn;i++)
        {
            // double/int veya double/double
            sum+=1.0f/i;

        }
        System.out.println("sum:"+sum);
    }
}
