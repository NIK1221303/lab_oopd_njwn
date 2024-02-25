public class Lab06_Q1{
    public static void main(String[] args) {

    //Staff s = new Staff ("Alex", 1000);
    Staff m = new Manager ("Siti", 4000, 1500);
    System.out.println (m);
    Staff t = new Technician ("Ali", 2000, 1200);
    System.out.println (t);

    }
}
abstract class Staff{
    private String name;
    private double salary;

    public Staff(){

    }
    public Staff(String name,double salary){

        this.name=name;
        this.salary=salary;

    }
    public String getName(){
        return name;
    }
    public  double getSalary(){
        return salary;
    }
    public abstract double getPaid();
}
class  Manager extends Staff{
    double allowance;

    public Manager(){


    }
    public Manager(String name,double salary,double allowance){
        super(name, salary);
        this.allowance=allowance;
    }
   
    @Override
    public double getPaid() {
        double total_paid=this.getSalary()+allowance;

        return total_paid;
    }
    public String toString(){
        return "Manager: name = "+this.getName()+" , salary = "+this.getSalary()+" , allowance = "+allowance+" , paid = "+this.getPaid();
    }
}
class Technician extends Staff{
    double overtimePay;

    public Technician(){


    }
    public Technician(String name,double salary,double overtimePay){
        super(name, salary);
        this.overtimePay=overtimePay;
    }
   
    @Override
    public double getPaid() {
        double total_paid=this.getSalary()+overtimePay;

        return total_paid;
    }
    public String toString(){
        return "Technician: name = "+this.getName()+" , salary = "+this.getSalary()+" , overtimePay = "+overtimePay+" , paid = "+this.getPaid();
    }
}
