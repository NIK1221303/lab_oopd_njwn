import java.util.Scanner;
import java.util.Stack;

public class Lab07_Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Stack<Integer> tower0 = new Stack<>();
        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();

        tower0.push(1);
        tower0.push(2);
        tower0.push(3);

       
       printTower(0,tower0);
       printTower(1, tower1);
       printTower(2, tower2);
        
       int source=-5;
       int destination=-5;

       while(source!=-1 || destination!=-1){

            System.err.println("Enter source tower and destination tower (-1 to exit): ");
            source=sc.nextInt();
            destination=sc.nextInt();

            if(source==0 && destination==1 ){
                moveElementStack(tower0, tower1);

            }else if(source==0 && destination==2 ){
                moveElementStack(tower0, tower2);

            }else if(source==1 && destination==0 ){
                moveElementStack(tower1, tower0);

            }else if(source==1 && destination==2 ){
                moveElementStack(tower1, tower2);

            }else if(source==2 && destination==0 ){
                moveElementStack(tower2, tower0);

            }else if(source==2 && destination==1 ){
                moveElementStack(tower2, tower1);

            }else{
                break;
            }
        printTower(0,tower0);
       printTower(1, tower1);
       printTower(2, tower2);
       }

    }
    public static void printTower(int num,Stack<Integer> tower){

        Stack<Integer> stack= new Stack<>();
        stack.addAll(tower); // Make a copy of the original stack

        System.err.print("Tower "+num+": [");
        while (stack.size() >0){
            if(stack.size()==1){
                System.err.print(stack.pop());
            }else{
                System.err.print(stack.pop()+", ");
            }
        }
            System.err.println("]");
    }
    public static void moveElementStack(Stack<Integer> source,Stack<Integer> destination){

        int value = source.pop();
        destination.push(value);
   
    }
}
