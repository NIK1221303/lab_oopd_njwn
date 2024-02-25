import java.util.Arrays;
import java.util.Scanner;

public class Lab03_Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String coursetoadd;
        String[] courses;
        String coursetodrop;
        String[] coursesdrop;

        System.err.print("Enter student id :");
        id = sc.nextInt();
        sc.nextLine();

        System.err.print("Enter student name :");
        name = sc.nextLine();

        Student student = new Student(id, name);

        System.err.print("Enter courses to add:");
        coursetoadd = sc.nextLine();
        courses = coursetoadd.split("\\s");
        for (String cor : courses) {
            student.addCourse(cor);
        }
        System.out.println(student.toString());

        System.err.println("Enter courses to drop:");
        coursetodrop = sc.nextLine();
        coursesdrop = coursetodrop.split("\\s");
        for (String cor : coursesdrop) {
            student.dropCourse(cor);
        }
        System.out.println(student.toString());

        sc.close();
    }

    
}

class Student {
    private int id;
    private String name;
    private String[] courses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new String[0];

    }

    public int getId() {
        return id;
    }

    public void addCourse(String Course) {
        
            int length = courses.length + 1;
            String[] newCourses = new String[length];
            for (int i = 0; i < length - 1; i++) {
                newCourses[i] = courses[i];
            }
            newCourses[length - 1] = Course; 
            courses = newCourses;
        
    }

    public void dropCourse(String course) {
        int index = -1;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(course)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newCourses = new String[courses.length - 1];
            for (int i = 0, newIndex = 0; i < courses.length; i++) {
                if (i != index) {
                    newCourses[newIndex++] = courses[i];
                }
            }
            courses = newCourses;
        }
    }

    public String toString() {

     
        return "id= " + id + "," + "name=" + name + "," + "courses = " + Arrays.toString(courses);
    }
}