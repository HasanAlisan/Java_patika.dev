package BaslangicSeviye.Metotlar;
import java.util.Scanner;
public class Odev2RecursiveAsal {
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
    // "Asal" sayı olup olmadığını bulan programı yazın.

    static int isAsal(int number, int numberT)
    {
        if(numberT==2) return 1;//numberT 2 veya 1'e kadar geldiyse number asaldır ve 1 döndürür (asal diye)

        numberT--;
        if (number%numberT==0) return 0;

        else return isAsal(number,numberT);

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Asallığı kontrol edilecek sayıyı giriniz: ");
        int number= input.nextInt();
        int numberT=number;
        if(isAsal(number,numberT)==1) System.out.print("asal sayı");
        else System.out.print("asal sayı değil");
    }
}
