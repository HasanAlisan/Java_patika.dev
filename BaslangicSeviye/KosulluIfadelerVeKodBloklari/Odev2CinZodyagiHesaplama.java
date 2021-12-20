package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun*/


public class Odev2CinZodyagıHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int dogumYili,dogumYiliMod12;
        String burc=null;
        System.out.print("Doğum yılını giriniz: ");
        dogumYili=input.nextInt();
        dogumYiliMod12=dogumYili%12;

        if(dogumYili>0)
        {
            if (dogumYiliMod12==0) burc="Maymun";
            else if (dogumYiliMod12==1) burc="Horoz";
            else if (dogumYiliMod12==2) burc="Köpek";
            else if (dogumYiliMod12==3) burc="Domuz";
            else if (dogumYiliMod12==4) burc="Fare";
            else if (dogumYiliMod12==5) burc="Öküz";
            else if (dogumYiliMod12==6) burc="Kaplan";
            else if (dogumYiliMod12==7) burc="Tavşan";
            else if (dogumYiliMod12==8) burc="Ejderha";
            else if (dogumYiliMod12==9) burc="Yılan";
            else if (dogumYiliMod12==10) burc="At";
            else if (dogumYiliMod12==11) burc="Koyun";
            System.out.println("Çin Zodyağı değeri: "+burc);
        }
        else System.out.println("Girilen doğum yılı hatalıdır !");


    }
}
