package BaslangicSeviye.Siniflar.Odev;

public class Employee {
    String nameSurname;
    float salary;
    float workHours;
    int hireYear;

    Employee(String nameSurname, int salary,int workHours, int hireYear){
        this.nameSurname=nameSurname;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    float tax(){
        float vergi=0;
        if(this.salary<1000){
            return vergi;
        }
        else if(this.salary>1000){
            vergi=this.salary*0.03f;
        }
        return vergi;
    }

    float bonus(){
        float bonus=0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
        }
        return bonus;
    }

    float raiseSalary(){
        float maasArtisi=0;
        int workingYear=2021-this.hireYear;
        if(workingYear<10){
            maasArtisi=this.salary*0.05f;
        }
        else if(workingYear>9&&workingYear<20){
            maasArtisi=this.salary*0.1f;
        }
        else if(workingYear>19){
            maasArtisi=this.salary*0.15f;
        }
        return maasArtisi;
   }

   void toPrint(){
       float totalSalaryChange=0;
       System.out.println("Adı               : "+this.nameSurname);
       System.out.println("Maaşı             : "+this.salary);
       System.out.println("Çalışma Saati     : "+this.workHours);
       System.out.println("İşe Başlangıç Yılı: "+this.hireYear);

       System.out.println("Vergi       : "+tax());
       System.out.println("Bonus       : "+bonus());
       System.out.println("Maaş Artışı : "+raiseSalary());

       totalSalaryChange= - tax() + bonus() + raiseSalary();
       System.out.println("Maaş miktarında ki değişiklik: "+totalSalaryChange);
       this.salary+=totalSalaryChange;
       System.out.println("Toplam Maaş: "+this.salary);

    }

}
