package BaslangicSeviye.Donguler;
import java.util.Scanner;

/*Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/


public class Pratik6ArmstrongSayilari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int numberIn,tempNumber,sum=0,digitNumber=0,digitValue=0,digitPow=1;

        System.out.print("Bir sayı giriniz: ");
        numberIn=input.nextInt();
        tempNumber=numberIn;

        /*
        // Armstrong sayı bulma
        //calculate number of digits

        while (tempNumber!=0)
        {
            digitNumber++;
            tempNumber/=10;
        }
        System.out.println("digitNumber: "+digitNumber);

        tempNumber=numberIn;
        while (tempNumber!=0)
        {
            //System.out.println("tempNumber: "+tempNumber); 157=  7-5-1
            digitValue=tempNumber%10;
            digitPow=1;
            for (int i =1;i<=digitNumber;i++) digitPow*=digitValue;
            sum+=digitPow;
            //System.out.println("numberIn: "+numberIn); 157= 157 15- 1--
            tempNumber/=10;
        }
        System.out.println("digit pow sum: "+sum);

        if (sum==numberIn) System.out.println(numberIn+" Armstrong sayıdır. ");
        else System.out.println(numberIn+" Armstrong sayı değildir. ");
        */


        //Bir sayının basamak sayılarının toplamını
        while (tempNumber!=0)
        {
            digitNumber=tempNumber%10;
            sum+=digitNumber;
            tempNumber/=10;

        }
        System.out.println(numberIn+" sayısının basamak toplamları: "+sum);


    }
}
