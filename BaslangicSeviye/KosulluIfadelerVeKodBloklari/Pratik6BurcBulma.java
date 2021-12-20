package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
Ödev

Aynı örneği switch-case kullanmadan yapınız.
 */


public class Pratik6BurcBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int month,day;
        String burc=null;
        boolean isError =false;


        System.out.print("Doğduğunuz ay: ");
        month= input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day= input.nextInt();

        if (month==1)
        {
            if(day>=1&&day<=31)
            {
                if (day<22) burc="Oğlak";
                else burc="Kova";
            }
            else isError =true;
        }
        else if (month==2)
        {
            if(day>=1&&day<=28)
            {
                if (day<20) burc="Kova";
                else burc="Balık";
            }
            else isError =true;
        }
        else if (month==3)
        {
            if(day>=1&&day<=31)
            {
                if (day<21) burc="Balık";
                else burc="Koç";
            }
            else isError =true;
        }
        else if (month==4)
        {

        }
        else if (month==5)
        {

        }
        else if (month==6)
        {

        }
        else if (month==7)
        {

        }
        else if (month==8)
        {

        }
        else if (month==9)
        {

        }
        else if (month==10)
        {

        }
        else if (month==11)
        {

        }
        else if (month==12)
        {

        }
        else isError=true;


        if(isError==true) System.out.println("Hatalı giriş Yaptınız tekrar deneyiniz.");
        else System.out.println("Burcunuz: "+burc);

    }
}

