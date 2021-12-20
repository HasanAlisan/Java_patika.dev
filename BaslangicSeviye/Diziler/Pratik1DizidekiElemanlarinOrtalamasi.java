package BaslangicSeviye.Diziler;
/*Ödev

Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi*/

public class Pratik1DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {

        /*int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);*/

        int[] numbers = {1, 2, 3, 4, 5};
        float sum = 0.0f;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Harmonik serinin " +(i+1)+ " inci elemanın değeri: "+1.0f/numbers[i]);
            sum += 1.0f/numbers[i];
        }

        System.out.println("Harmonik Ortalama: "+numbers.length/sum );
    }
}
