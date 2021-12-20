package BaslangicSeviye.Metotlar;

public class Recursive {
    static int basamaklarToplami(int sayi){
        System.out.println("sayi: "+sayi);
        if (sayi == 0){
            return 0;
        }
        else
        {
            int basamak= basamaklarToplami(sayi / 10);
            System.out.println("basamak: "+basamak);

            int mod10= sayi % 10;
            System.out.println("mod10: "+mod10);

            return  basamak+mod10;
        }

    }
    public static void main(String[] args){
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
    }
}

