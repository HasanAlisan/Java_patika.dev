package BaslangicSeviye.Siniflar.Pratik1;

public class Student {
    Course mat;
    Course fizik;
    Course kimya;

    String name,stuNo;
    int classes;
    float avarage;
    float avarageM;
    float avarageF;
    float avarageK;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat ,Course fizik,Course kimya)
    {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void addBulkOralExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozlu== 0
                || this.fizik.sozlu== 0 || this.kimya.sozlu== 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarageF= (this.fizik.note*(1-this.fizik.sozluYuzde)) + (this.fizik.sozluYuzde*this.fizik.sozlu);
        this.avarageK= (this.kimya.note*(1-this.kimya.sozluYuzde)) + (this.kimya.sozluYuzde*this.kimya.sozlu);
        this.avarageM= (this.mat.note*(1-this.mat.sozluYuzde)) + (this.mat.sozluYuzde*this.mat.sozlu);
        this.avarage=(avarageF+avarageM+avarageK)/3.0f;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci         : " + this.name);
        System.out.println("Matematik Notu  : " + this.mat.note   +  "\tMatematik Sozlu: "+this.mat.sozlu);
        System.out.println("Fizik Notu      : " + this.fizik.note +  "\tFizik Sozlu    : "+this.fizik.sozlu);
        System.out.println("Kimya Notu      : " + this.kimya.note +  "\tKimya Sozlu    : "+this.kimya.sozlu);
    }

}
