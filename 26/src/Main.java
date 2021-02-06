import child.Ceo;
import child.Developer;
import child.Grades;
import child.Specialist;
import parent.Employee;
import parent.Manager;

public class Main {
    public static void main(String[] args) {
        Specialist specTanya = new Specialist("Tanya",25,700,1);
        Specialist specDima = new Specialist("Dmitrii",22,800,2);
        Specialist specEvgen = new Specialist("Evgenii",27,1000,3);

        Developer[] coders = new Developer[4];
        coders[0] = new Developer("Chingiz",18,400, Grades.JUNIOR);
        coders[1]= new Developer("Artem",20,1200,Grades.MIDDLE);
        coders[2]= new Developer("Bektur",24,1400,Grades.SENIOR);
        coders[3]= new Developer("Temir",33,2000,Grades.TEAMLEAD);

        Manager managerOlga = new Manager("Olga",30,1300,false);
        Manager managerOleg = new Manager("Oleg",29,1600,true);
        Ceo ceo=new Ceo("Nick",41,2400,false,true);

        printGrades(coders);
    }

    public static  void printGrades(Developer[] dev){
        for(Developer coder : dev){
            switch (coder.getGrades()){
                case JUNIOR:
                    System.out.println("I am super-junior developer!");
                    break;
                case MIDDLE:
                    System.out.println("I am serious Middle developer.");
                    break;
                case SENIOR:
                    System.out.println("I am Senior developer.");
                    break;
                case TEAMLEAD:
                    System.out.println("I am awesome Teamlead!");
            }
        }
    }
}
