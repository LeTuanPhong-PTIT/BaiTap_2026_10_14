abstract class Employee{
    protected String name;
    protected int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int calculateSalary(){
        return salary;
    }
}

class OfficeEmployee extends Employee{
    protected int allowance = 1000000;

    public OfficeEmployee(String name, int salary){
        super(name, salary);
    }

    @Override 
    public int calculateSalary(){
        return salary + allowance;
    }
}

class TechnicalEmployee extends Employee{
    protected int allowance = 2000000;

    public TechnicalEmployee(String name, int salary){
        super(name, salary);
    }

    @Override 
    public int calculateSalary(){
        return salary + allowance;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new OfficeEmployee("An", 10000000),
            new TechnicalEmployee("Binh", 10000000) 
        };

        for (Employee employee: employees){
            System.out.println(employee.name + " - Luong: " + employee.calculateSalary());
        }
    }
}
