package BaslangicSeviye.Siniflar.Pratik2;

//Ödev
//
//Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
public class MainBoksOyunu {

    public static void main(String[] args) {
        Fighter marc = new Fighter("A" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("B" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }

}
