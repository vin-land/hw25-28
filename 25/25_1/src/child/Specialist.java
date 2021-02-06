package child;

import parent.Employee;

public class Specialist extends Employee {
    private int levels;

    public Specialist(){}

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public void setLevels(int levels){
        this.levels=levels;
    }

    public int getLevels(){
        return levels;
    }

    public void workWithClients(){
        System.out.println("I communicate with clients and make technical task.");
    }

    @Override
    public void print() {
        System.out.printf("Name: %s, Age: %d, Salary: %.2f, levels: %d\n",
                getName(),getAge(),getSalary(),getLevels());
    }

    @Override
    public void goToVacation(){
        System.out.println("I will have a fun!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("Deadlines are on! And i`ve not started my diplom work!!!");
    }


}
