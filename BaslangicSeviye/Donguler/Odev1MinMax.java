package BaslangicSeviye.Donguler;
import java.util.Scanner;
public class Odev1MinMax {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük
        // ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        int totalNumber,testN;

        Scanner input =new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz (karşılaştırma için >=2 adetten fazla giriş yapınız!): ");
        totalNumber =input.nextInt();
        testN=totalNumber;

        int number,biggestN=0,smallestN=0;
        while(totalNumber>=1){
            System.out.print("Girmek istediğiniz sayı: ");
            number =input.nextInt();

            if(totalNumber==testN)
            {
                biggestN=number;
                smallestN=number;
            }
            else
            {
                if (number>biggestN)
                {
                    biggestN=number;
                }
                if (number<smallestN)
                {
                    smallestN=number;
                }
            }
            totalNumber--;
        }
        System.out.println("En büyük sayı: "+biggestN);
        System.out.println("En küçük sayı: "+smallestN);
    }
}


