package BaslangicSeviye.KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

/*
*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki
indirimleri uygulayın ;

   * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
     Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
   * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
   * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
   * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
   * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır


İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL

* */



public class Odev1UcakBiletiFiyati {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int mesefaKM, yas,yolculukTipi;

        float perKM=0.1f,normalTutar;

        System.out.print("km mesafesini giriniz:" );
        mesefaKM=input.nextInt();

        if(mesefaKM<0){
            System.out.println("Hatalı Veri Girdiniz");
            System.out.print("km mesafesini giriniz:" );
            mesefaKM=input.nextInt();
        }

        System.out.print("yolcu yaşını giriniz:" );
        yas=input.nextInt();
        if(yas<0){
            System.out.println("Hatalı Veri Girdiniz");
            System.out.print("yolcu yaşını giriniz:" );
            yas=input.nextInt();
        }

        System.out.print("yolculukTipi [Tek Yön (1)/Gidiş-Dönüş(2)] giriniz:" );
        yolculukTipi=input.nextInt();
        if(!(yolculukTipi==1||yolculukTipi==2)){
            System.out.println("Hatalı Veri Girdiniz");
            System.out.print("yolculukTipi [Tek Yön (1)/Gidiş-Dönüş(2)] giriniz:" );
            yolculukTipi=input.nextInt();
        }

        //İndirim tutarlarının hesaplanması
        normalTutar=mesefaKM*perKM;
        System.out.println("normal tutar: "+normalTutar);

        if (yas<12)
        {
            normalTutar=(normalTutar*0.5f);
            System.out.println("yas<12, bilet fiyatı üzerinden %50 indirimli bilet fiyatı: "+normalTutar);
        }
        else if (yas>12&&yas<24)
        {
            normalTutar=(normalTutar*0.9f);
            System.out.println("yaş 12 ve 24 arasında, " +
                    "bilet fiyatı üzerinden %10 indirimli bilet fiyatı: "+normalTutar);
        }
        else if (yas>65)
        {
            normalTutar=(normalTutar*0.7f);
            System.out.println("yas>65, bilet fiyatı üzerinden %30 indirimli bilet fiyatı: "+normalTutar);
        }
        else System.out.println("Bu yaş aralığı için indirim bulunmamaktadır.");

        if (yolculukTipi==2)
        {
            normalTutar=(normalTutar*0.8f)*2;
            System.out.println("yolculukTipi==2, " +
                    "bilet fiyatı üzerinden %20 indirimli iki kişilik bilet fiyatı: "+normalTutar);
        }


    }
}
