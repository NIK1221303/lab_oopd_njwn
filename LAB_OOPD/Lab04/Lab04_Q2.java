public class Lab04_Q2{
    public static void main(String[] args) {
        
        //without using polymorphism
        Persons person = new Persons("Ali");
        System.err.println(person);
        Students student = new Students("Bob", "111");
        System.err.println(student);
        Staffs staff = new Staffs("Cat", 3000);
        System.err.println(staff);
        Subjects subject = new Subjects("TCP1201", "OOPDS");
        Lecturers lecturer = new Lecturers("Danny", 4000, subject);
        System.err.println(lecturer);
        System.err.println("");

        //using polymorphhism
        Persons person2 = new Persons("Ali");
        System.err.println(person2);
        Persons student2 = new Students("Bob", "111");
        System.err.println(student2);
        Persons staff2 = new Staffs("Cat", 3000);
        System.err.println(staff2);
        Persons lecturer2 = new Lecturers("Danny", 4000, subject);
        System.err.println(lecturer2);

    }
}
class Persons{
    private String name;

    Persons(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Person: name = "+name;
    }

}
class Students extends Persons{

    private String studentID;

    Students(String name,String studentID){

        super(name);
        this.studentID=studentID;
    }
    @Override
    public String toString(){
        return "Student: name = "+this.getName() +" , id = "+studentID;
    }
}
class Staffs extends Persons{

    private double salary;
    
    Staffs(String name,double salary){

        super(name);
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return "Staff: name = "+this.getName() +" , salary = "+salary;
    }
}
class Subjects{
    private String subjectCode;
    private String subjectName;

    Subjects(String subjectCode, String subjectName){
        this.subjectCode=subjectCode;
        this.subjectName=subjectName;
    }
    public String toString(){
        return subjectCode+" "+subjectName;
    }
}
class Lecturers extends Staffs{

    private Subjects sub;
    Lecturers(String name,double salary,Subjects sub){
        super(name, salary);
        this.sub=sub;

    }
    @Override
    public String toString(){
        return "Lecturer: name = "+this.getName() +" , salary = "+this.getSalary()+" , subject = "+sub.toString();
    }
}