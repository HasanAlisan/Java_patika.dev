package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*Ödev

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
 aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

public class Pratik2KullaniciGiris {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String userName, password="java123",inPassword;

        System.out.print("kullanıcı adını giriniz: ");
        userName=input.next();
        System.out.print("kullanıcı şifresini giriniz: ");
        inPassword=input.next();

        if(userName.equals("patika")&&inPassword.equals(password))
        {
            System.out.print("Giriş yaptınız!");

        }
        else
        {
            if(userName.equals("patika")&&!inPassword.equals(password))
            {
                int sifreSifirla;
                System.out.println("şifreniz yanlış!");
                System.out.print("şifrenizi sıfırlamak ister misiniz?\n" +
                        "-evet=1\n" +
                        "-hayır=0\n" +
                        "kararınız:");
                sifreSifirla =input.nextInt();

                if (sifreSifirla==1)
                {

                    System.out.print("yeni şifrenizi giriniz:");
                     //!!!!!!! nextLine() kullanıldığında giriş almadan diğer adıma geçiyor
                    inPassword= input.next();

                    if(inPassword.equals(password))
                        System.out.print("Şifre oluşturulamadı,lütfen başka bir şifre giriniz.");
                    else System.out.print("Şifre oluşturuldu");

                }
                else System.out.print("şifreniz sıfırlanamadı!");
            }
            else if (inPassword.equals(password)&&!userName.equals("patika"))
                System.out.print("kullanıcı adınız yanlış!");
            else System.out.print("kullanıcı adınız ve şifreniz yanlış!");

        }

    }
}
