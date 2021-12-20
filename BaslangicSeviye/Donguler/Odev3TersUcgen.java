package BaslangicSeviye.Donguler;
import java.util.Scanner;
public class Odev3TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("basamak sayısını giriniz:" );
        int rowN=input.nextInt();

        for(int i=rowN;i>=1;i--)
        {
            for (int j=1;j<=(rowN-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=2*i-1;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
