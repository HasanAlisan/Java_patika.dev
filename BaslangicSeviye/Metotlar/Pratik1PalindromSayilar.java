package BaslangicSeviye.Metotlar;
import java.util.Scanner;
public class Pratik1PalindromSayilar {
    static boolean isPanlindrom(int number)
    {
        int tempN,lastN,reverseN=0;
        tempN=number;
        while (tempN!=0)
        {
            lastN=tempN%10;
            reverseN= (reverseN*10)+lastN;
            tempN/=10;

        }
        if (number==reverseN) return true;
        else return false;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Palindrom kontrol sayısını giriniz: ");
        int number= input.nextInt();
        if (isPanlindrom(number)==true) System.out.println("girilen sayı palindromdur.");
        else System.out.println("girilen sayı palindrom değildir.");
    }
}
