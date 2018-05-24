import java.util.LinkedList;

public class Queuey {
    LinkedList queue;

    //making a queue instance
    public Queuey(){
        queue=new LinkedList();
    }
    //Is our queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //what is the size of our queue
    public int size(){
        return queue.size();
    }
    //enqueuing an item
    public void enqueue(int n){
        queue.addLast(n);
    }

    //Dequeuing an item
    public int dequeue(){
        return (int)queue.remove(0);
    }

    //peek at the first item
    public int peek(){
        return  (int)queue.get(0);
    }

    public static void main(String[] args) {
        Queuey numberQueue=new Queuey();
        numberQueue.enqueue(5);
    }
}
