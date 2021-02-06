package parent;

abstract public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(){}

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<=14 && age>100)
            return;
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary<0)
            return;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void print(){
        System.out.printf("Name: %s, Age: %d, Salary: %.2f\n",
                getName(),getAge(),getSalary());
    }

    public void goToVacation(){
        System.out.println("I`m going to spent time with family");
    }

    public abstract void goToDayOff();
}
