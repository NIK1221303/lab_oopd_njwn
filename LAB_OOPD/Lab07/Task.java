import java.util.*; 

public class Task implements Comparable<Task>{
  private int value;
  private String name;

  public Task(int value, String name) {
    this.value = value;
    this.name = name;
  }

  public String toString() {
    return "Task <value=" + value + " name=" + name + ">";
  }

  @Override
  public int compareTo(Task o) {
    // TODO Auto-generated method stub
    return Integer.compare(o.value, this.value);
  }
}

class TestQueues {
  public static void main (String[] args) {

    //add task to Queue

    Queue<Task> tasks = new LinkedList<>();
    tasks.offer(new Task(3, "Press"));
    tasks.offer(new Task(8, "Drill"));
    tasks.offer(new Task(1, "Knock"));

    while(!tasks.isEmpty()){
      System.out.println ("Removed from PriorityQueue<Integer>: " +tasks.poll()); 
;
    }
    System.err.println("");
    PriorityQueue<Task> priorityTasks = new PriorityQueue<>();
    priorityTasks.offer(new Task(3, "Press"));
    priorityTasks.offer(new Task(8, "Drill"));
    priorityTasks.offer(new Task(1, "Knock"));

    while(!priorityTasks.isEmpty()){
      System.out.println ("Removed from PriorityQueue<Integer>: " +priorityTasks.poll()); 
;
    }
    System.err.println("");

    PriorityQueue<Integer> intPQ = new PriorityQueue<>();
    intPQ.offer (40);
    intPQ.offer (60);
    intPQ.offer (20);
    while (!intPQ.isEmpty())
      System.out.println ("Removed from PriorityQueue<Integer>: " + 
        intPQ.poll());
  }
}
