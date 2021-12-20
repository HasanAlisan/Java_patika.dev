package BaslangicSeviye.Metotlar;
import java.util.Scanner;
public class Odev1RecursiveUsAlma {

    static int Pow(int taban,int üs)
    {
        if(üs==0) return 1;
        return taban*Pow(taban,üs-1);
    }


    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int taban,üs;
    System.out.print("Taban değerini giriniz: ");
    taban= input.nextInt();
    System.out.print("Üs değerini giriniz: ");
    üs= input.nextInt();

    System.out.print("sonuç: "+Pow(taban,üs));



    }
}
