package BaslangicSeviye.Diziler;
import java.util.Arrays;

/*
Odev
Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program*/

public class Pratik4DizidekiTekrarEdenSayilariBulma {

    static boolean isSame(int[] liste, int value){
        for(int i =0;i<liste.length;i++){
            if (liste[i]==value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] liste={1,2,3,4,4,5,5,2,8,1,8};
        int[] dublicate= new int[liste.length];
        int startIndex=0;

        for(int i =0; i<liste.length;i++){
            for (int j = 0;j<liste.length;j++){
                if( (i!=j) && (liste[i]==liste[j]) && (liste[i] % 2==0) ){
                    if(isSame(dublicate,liste[j])){
                        dublicate[startIndex++]=liste[j];
                    }
                }
            }
        }

        for(int i:dublicate){
            if (i!=0){
                System.out.println("sayı dizisindeki tekrar eden çift sayılar: " +i);
            }
        }



    }

}
