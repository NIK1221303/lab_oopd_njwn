import java.util.Scanner;
import java.util.ArrayList;

public class Lab03_Q2 {
    public static void main(String[] args) {
        
        //Sample output 1
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Students> students = new ArrayList<>();

        printCourses(courses);
        printStudents(students);
        

        //Sample output 2 
        courses.add(new Course("TCP1101", "Lee"));
        courses.add(new Course("TMA1101", "Lim"));
        courses.add(new Course("TMA1201", "Tong"));

        students.add(new Students(111, "Ali"));
        students.add(new Students(222, "Bob"));

        printCourses(courses);
        printStudents(students);

        //Sample output 3
        students.get(0).addCourse(courses.get(0));
        students.get(0).addCourse(courses.get(1));
        students.get(0).addCourse(courses.get(2));

        students.get(1).addCourse(courses.get(1));

        printCourses(courses);
        printStudents(students);

        //Sample output 4
        Scanner sc = new Scanner(System.in);
        int id;
        String course;

        System.err.print("Enter student id:");
        id=sc.nextInt();
        sc.nextLine();

        for(Students stu : students)
        {
           if(id==stu.getId())
           {
            System.err.println("");
            System.out.print("Enter course code to drop:");
            course=sc.nextLine();
            course=course.toUpperCase();

            for(Course cor : courses)
            {
                if(course.equals(cor.getCode()))
                {
                    stu.dropCourse(cor);
                }
            }

           
           }
        }

        printCourses(courses);
        printStudents(students);
        

        sc.close();
    }
    public static void printCourses( ArrayList<Course> courses)
    {
        int no=1;
        System.err.println("*** Courses ***");
        System.err.println("No. Code/Teacher");

        if(courses.isEmpty())
            {
                System.err.println("-");
            }
        for(Course cor : courses)
            {
                System.err.println(no+". "+cor.toString());
                no++;
            }
            System.err.println("");
    }
    public static void printStudents( ArrayList<Students> students)
    {
        int no=1;
        System.err.println("*** Students ***");
        System.err.println("No. ID  Name    Course");
        if(students.isEmpty())
            {
                System.err.println("-");
            }
        for(Students stu : students)
            {
                System.err.println(no+". "+stu.toString());
                no++;
            }
            System.err.println("");
    }

}
class Students {
    private int id;
    private String name;
    private ArrayList<Course> courses;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void addCourse(Course course) {
        
           courses.add(course);
        
    }

    public void dropCourse(Course course) {
        courses.remove(course);

    }

    public String toString() {

     
        return  "   "+ id + "  " +  name + "    " +  courses;
    }
}
class Course
{
    private String code;
    private String teacher;

    Course(String code, String teacher){
        this.code=code;
        this.teacher=teacher;
    }
    public String getCode()
    {
        return code;
    }
    public String toString()
    {
        return code+"/"+teacher;
    }
}