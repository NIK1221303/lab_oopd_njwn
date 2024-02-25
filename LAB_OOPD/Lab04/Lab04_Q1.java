public class Lab04_Q1{
    public static void main(String[] args) {
        
        Person person = new Person("Ali");
        System.err.println(person);
        Student student = new Student("Bob", "111");
        System.err.println(student);
        Staff staff = new Staff("Cat", 3000);
        System.err.println(staff);
        Subject subject = new Subject("TCP1201", "OOPDS");
        Lecturer lecturer = new Lecturer("Danny", 4000, subject);
        System.err.println(lecturer);
        System.err.println("");

        //using polymorphhism
        Person person2 = new Person("Ali");
        System.err.println(person2);
        Person student2 = new Student("Bob", "111");
        System.err.println(student2);
        Person staff2 = new Staff("Cat", 3000);
        System.err.println(staff2);
        Person lecturer2 = new Lecturer("Danny", 4000, subject);
        System.err.println(lecturer2);

    }
}
class Person{
    public String name;

    Person(String name){
        this.name=name;
    }

    public String toString(){
        return "Person: name = "+name;
    }

}
class Student extends Person{

    public String studentID;

    Student(String name,String studentID){

        super(name);
        this.studentID=studentID;
    }
    @Override
    public String toString(){
        return "Student: name = "+name +" , id = "+studentID;
    }
}
class Staff extends Person{

    public double salary;
    
    Staff(String name,double salary){

        super(name);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Staff: name = "+name +" , salary = "+salary;
    }
}
class Subject{
    private String subjectCode;
    private String subjectName;

    Subject(String subjectCode, String subjectName){
        this.subjectCode=subjectCode;
        this.subjectName=subjectName;
    }
    public String toString(){
        return subjectCode+" "+subjectName;
    }
}
class Lecturer extends Staff{

    Subject sub;
    Lecturer(String name,double salary,Subject sub){
        super(name, salary);
        this.sub=sub;

    }
    @Override
    public String toString(){
        return "Lecturer: name = "+name +" , salary = "+salary+" , subject = "+sub.toString();
    }
}