package BaslangicSeviye.DigerKonular;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pratik1SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            }
            else {
                System.out.println("Hatalı bir sayı girdiniz !");

                if (selected > number)
                {
                    if(selected-number<10)
                    {
                        if(selected-number<5)
                        {
                            System.out.println(selected + " sayısı, SICAK.");
                        }
                        else
                        {
                            System.out.println(selected + " sayısı, SOĞUK.");
                        }
                    }
                    else
                    {
                        System.out.println(selected + " sayısı, ÇOK SOĞUK.");
                    }
                }
                else
                {
                    if(number-selected<10)
                    {
                        if(number-selected<5)
                        {
                            System.out.println(selected + " sayısı, SICAK.");
                        }
                        else
                        {
                            System.out.println(selected + " sayısı, SOĞUK.");
                        }
                    }
                    else
                    {
                        System.out.println(selected + " sayısı, ÇOK SOĞUK.");
                    }
                }


                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
