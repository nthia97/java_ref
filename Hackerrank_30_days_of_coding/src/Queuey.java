import java.util.LinkedList;
import java.util.Stack;

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
        Stack<String> stacky=new Stack();
        stacky.push("there");
        stacky.push("hi");

        System.out.println(stacky.pop()+" ");
        System.out.println("Peek "+stacky.peek());
        System.out.println(stacky.pop()+" ");
        System.out.println("Size "+stacky.size());





//        Queuey numberQueue=new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//
//        System.out.println("First out : "+numberQueue.dequeue());
//        System.out.println("Peeked at the second element :"+numberQueue.peek());
//        System.out.println("Second out : "+numberQueue.dequeue());
//        System.out.println("Third out : "+numberQueue.dequeue());
    }
}
