package BaslangicSeviye.Donguler;
import java.util.Scanner;
/*Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

        Ödev
        Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
        EKOK = (n1*n2) / EBOB
        */



public class Pratik10EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayiIn1,sayiIn2,ebob=1,ekok=0,selection;
        System.out.print("Birinci sayıyı giriniz: ");
        sayiIn1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayiIn2=input.nextInt();
        System.out.print("ebob(1)-ekok(2) giriniz: ");
        selection=input.nextInt();

        /*
        //birinci yöntem for döngüsü ebob
        for (int i =1;i<=sayiIn1;i++)
        {
            if((sayiIn1 % i)==0 && (sayiIn2 % i)==0)
            {
                ebob=i;

            }
        }
        */


        /*

        // ikinci yöntem for döngüsü ebob
        if (sayiIn1>sayiIn2)
        {
            for (int i=sayiIn2;i>=1;i--)
            {
                if((sayiIn1 % i)==0 && (sayiIn2 % i)==0)
                {
                    ebob=i;
                    break;
                }
            }
        }
        else
        {
            for (int i=sayiIn1;i>=1;i--)
            {
                if((sayiIn1 % i)==0 && (sayiIn2 % i)==0)
                {
                    ebob=i;
                    break;
                }
            }
        }
        System.out.println("ebob: "+ebob);
        */

        /*

        //for döngüsü ekok
        for(int i=1;i<=(sayiIn1*sayiIn2);i++)
        {
            if((i % sayiIn1)==0 && (i % sayiIn2)==0)
            {
                System.out.println("ekok: "+i);
                break;
            }
        }
        */
        int i=1;
        switch (selection)
        {
            case 1: //ebob
                i=sayiIn1;
                while(i>=0)
                {
                    if((sayiIn1 % i)==0 && (sayiIn2 % i)==0)
                    {
                        System.out.println("ebob: "+i);;
                        i=1;
                        break;
                    }
                    i--;
                }
                break;

            case 2: //ekok
                while(i<=(sayiIn1*sayiIn2))
                {
                    if((i % sayiIn1)==0 && (i % sayiIn2)==0)
                    {
                        System.out.println("ekok: "+i);
                        i=1;
                        break;
                    }
                    i++;
                }
                break;
        }






    }
}
