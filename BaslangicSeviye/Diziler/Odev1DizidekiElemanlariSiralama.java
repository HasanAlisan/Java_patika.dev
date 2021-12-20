package BaslangicSeviye.Diziler;
import java.util.Scanner;
import java.util.Arrays;
/*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
*/

public class Odev1DizidekiElemanlariSiralama {

    static int[] minToMax(int[] array){

        //insertion sort
        for(int i=1;i<array.length;i++){
            int j = i;
            while (j>0 && array[j-1]>array[j]){
                int tempN=array[j];
                array[j]=array[j-1];
                array[j-1]=tempN;
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int arraySize;
        int[] array;

        System.out.print("Dizinin boyutunu giriniz: ");
        arraySize= input.nextInt();
        array=new int[arraySize];

        System.out.println("Dizinin elemanlarını giriniz. ");
        for (int i =0; i<arraySize;i++){
            System.out.print("Dizinin "+(i+1)+" nci elemanı: ");
            array[i]= input.nextInt();

        }

        System.out.println("Girilen dizi: "+ Arrays.toString(array));
        System.out.println("Küçükten büyüğe: "+Arrays.toString(minToMax(array)));
        //Arrays.sort(array);
        //System.out.println("Arrays.sort(),Küçükten büyüğe sıralanan dizi: "+  Arrays.toString(array));



    }
}
