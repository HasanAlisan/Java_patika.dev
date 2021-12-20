package BaslangicSeviye.Siniflar.Pratik1;

public class Course {
    //Niteliklerde bir sınıf varsa genelde niteliklerden önce yazılır.
    Teacher courseTeacher; // Teacher sınıfından courseTeacher isimli nesneyi nitelik olarak alabiliriz.
                           // Sınıflarda birbirlerinin nitelikleri olabilir.
                           // Hafızada courseTeacher adında bir nesne var ama bir değeri henüz yok. (null)
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    float sozluYuzde;

    //dersin notu varsayılan olarak sıfır olması için o onu almadık.
    Course(String name,String code,String prefix,int sozluYuzde)
    {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.sozluYuzde=sozluYuzde/100.0f;
        int note=0;
        int sozlu=0;

    }


    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}




