import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lab08_Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        Set<Integer> linkedHashNum = new LinkedHashSet<>(nums);
        int integer;

        System.err.println("Enter 5 integers");

        for(int i=0;i<5;i++){
            integer=sc.nextInt();
            nums.add(integer);
           linkedHashNum.add(integer);
        }

        TreeSet<Integer> treeNum = new TreeSet<>(nums);
        for (int num : treeNum) {
            System.out.print(num+" , ");
        }
        System.err.println(" ");
       
        for (int num : linkedHashNum) {
            System.out.print(num+" , ");
        }
    }
}