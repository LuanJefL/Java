package entidades;

public class Employer{

    private String name;
    private int id;
    private double salary;

    public Employer(String name, int ID, double Salary) {

        this.name = name;
        this.id = ID;
        this.salary = Salary;

    }

    public String getName() {return this.name;}
    public int getId() {return this.id;}
    public double getSalary() {return this.salary;}

    public void setSalary(double salary) {this.salary = salary;}

    public String toString() {return String.format("ID:%d, Name:%s, Salary:%.2f\n", this.id, this.name, this.salary);}

}
