import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lab07_Q1{
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        

        ArrayList<Integer> storeNum = new ArrayList<>();

        generateRandomNum(random, storeNum);
        boolean quit = false;

        //!quit equals true
        while(!quit){
            int count=0;
        for(int list: storeNum){
            
            if(count==0){
                System.err.print("List: ["+list+",");
            }
            else if(count==9){
                System.err.println(list+"]");
            }
            else{
                System.err.print(list+",");
            }
            count++;
           
        }
        System.err.println("Enter your choice:");
        System.err.println("1: New random list\n2: Sort list\n3: Reverse list\n4: Shuffle list\n0: Quit");
        System.err.print("> ");
        int choice = sc.nextInt();
        //sc.next();

        if(choice == 1){
            storeNum.clear();
            storeNum=generateRandomNum(random, storeNum);
        }else if(choice == 2){
           Collections.sort(storeNum);

        }else if(choice == 3){
            Collections.reverse(storeNum);
        }else if(choice == 4){
            Collections.shuffle(storeNum);
        }else if(choice == 0){
            quit=true;
           
        
        }
        }
        

    }
    public static ArrayList<Integer> generateRandomNum( Random random,ArrayList<Integer> storeNum){
       
        for(int i=0;i<10;i++){
            int generateNum = random.nextInt(99);
            storeNum.add(generateNum);
        }
        return storeNum;
    }

    
}