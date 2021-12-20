package BaslangicSeviye.Diziler;
import java.util.Arrays;

/*
dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.*/

public class Odev2DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list=new int[]{10, 20, 20, 10, 10, 20, 5, 20,21};
        int repetitions=1;

        System.out.println("inpust list: "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("sorted list: "+Arrays.toString(list));

        for (int i =0;i<list.length;i++){
            int j =i;
            while (j<list.length-1 && list[j]==list[j+1]){
                repetitions+=1;
                j+=1;
            }
            if(j==0){
                repetitions+=1;
            }
            System.out.println(list[j]+" sayısı "+repetitions+" kere tekrar edildi.");
            repetitions=1;
            i=j;
        }




    }
}
