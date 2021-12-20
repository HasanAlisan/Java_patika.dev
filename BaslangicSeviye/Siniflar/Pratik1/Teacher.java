package BaslangicSeviye.Siniflar.Pratik1;

public class Teacher {

    String name;
    String mpno;
    String branch;

    public Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print()
    {
        System.out.println("adı: "+this.name);
        System.out.println("cep telefon numarası: "+this.mpno);
        System.out.println("bölümü: "+this.branch);

    }

}
