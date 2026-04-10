public class ManagerEm extends Employee {
    private double bonus;

    public ManagerEm(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    //Untuk menjawab nomor 4
    // public Manager(String name, double salary, int year, int month, int day, double bonus){
    //     super(name, salary, year, month, day);
    //     this.bonus = bonus;
    // }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}