package child;

import parent.Manager;

public class Ceo extends Manager {
    private boolean hasCompanyCar;

    public Ceo(){}
    public Ceo(String name, int age, double salary, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar){
        this.hasCompanyCar=hasCompanyCar;
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void goPublic(){
        System.out.println("I found investors! Let's get to work.");
    }

    @Override
    public void print() {
        System.out.printf("Name: %s, Age: %d, Salary: %.2f, hasStocks: %b, hasCompanyCar: %b\n",
                getName(),getAge(),getSalary(),getHasStocks(),getHasCompanyCar());
    }

    @Override
    public void goToVacation(){
        System.out.println("I`m going to Hawaii with our partners.");
    }

    @Override
    public void goToDayOff() {
        System.out.println("i won`t come tommorow, have a business.");
    }
}
