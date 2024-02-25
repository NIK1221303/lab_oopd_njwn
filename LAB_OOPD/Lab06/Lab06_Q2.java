import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Lab06_Q2{
    public static void main(String[] args) {

    Staffs[] staffArray = { new Technicians ("Ali", 2000, 1200),
                         new Managers ("Siti", 4000, 800),
                         new Technicians ("Abu", 1500, 500) };

  // Create an ArrayList from staffArray.
  ArrayList<Staffs> staffList = new ArrayList<>(Arrays.asList(staffArray));

  // 1. Add code to sort and print staffArray.
        Arrays.sort(staffArray);

        System.err.println("Array");
        for(Staffs staff : staffArray)
        {
            System.err.println(staff);
        }


  // 2. Add code to sort and print staffList.
        Collections.sort(staffList);
        for(Staffs staff: staffList){
            System.err.println(staff);
        }

    }
}
abstract class Staffs implements Comparable<Staffs>{
    private String name;
    private double salary;

    public Staffs(){

    }
    public Staffs(String name,double salary){

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

    @Override
    public int  compareTo(Staffs other){
        return Double.compare(this.getPaid(), other.getPaid());
    }
}
class  Managers extends Staffs{
    double allowance;

    public Managers(){


    }
    public Managers(String name,double salary,double allowance){
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
class Technicians extends Staffs{
    double overtimePay;

    public Technicians(){


    }
    public Technicians(String name,double salary,double overtimePay){
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
