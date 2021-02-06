import child.Ceo;
import child.Developer;
import child.Specialist;
import parent.Employee;
import parent.Manager;

public class Main {
    public static void main(String[] args) {
        Specialist specTanya = new Specialist("Tanya",25,700,1);
        Specialist specDima = new Specialist("Dmitrii",22,800,2);
        Specialist specEvgen = new Specialist("Evgenii",27,1000,3);

        Developer[] coders = new Developer[4];
        coders[0] = new Developer("Chingiz",18,400,"Junior");
        coders[1]= new Developer("Artem",20,1200,"Middle");
        coders[2]= new Developer("Bektur",24,1400,"Middle");
        coders[3]= new Developer("Temir",33,2000,"Senior");

        Manager managerOlga = new Manager("Olga",30,1300,false);
        Manager managerOleg = new Manager("Oleg",29,1600,true);
        Ceo ceo=new Ceo("Nick",41,2400,false,true);

        Employee[] workers=new Employee[10];
        System.arraycopy(coders,0,workers,0,coders.length);
        workers[4]=specDima;
        workers[5]=specTanya;
        workers[6]=specEvgen;
        workers[7] = managerOleg;
        workers[8] = managerOlga;
        workers[9] = ceo;
        for (Employee vac:workers)
            vac.goToDayOff();
    }
}
