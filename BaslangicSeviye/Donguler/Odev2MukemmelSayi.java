package BaslangicSeviye.Donguler;
import java.util.Scanner;
public class Odev2MukemmelSayi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number,sum=0;
        System.out.print("Mükemmel Sayı Kontrolü için istenen sayıyı giriniz: ");
        number =input.nextInt();

        for(int i=1;i<number;i++)
        {
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("Girilen sayı mükemmel sayıdır");
        }
        else {
            System.out.println("Girilen sayı mükemmel sayı değildir");
        }

    }
}
