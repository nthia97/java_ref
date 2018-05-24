package LinkedList;


public class LinkedList {
    //Properties
    Node head;
    int count;
    //constructors
//    public LinkedList()
//    {
//        head=null;
//        count=0;
//    }

    public LinkedList(Node newHead)
    {
        head=newHead;
        count=1;
    }
    //methods
    //add
    public void add(int newData)
    {
        Node temp=new Node(newData);
        Node current=head;
        while (current.getNext()!=null)
            current=current.getNext();

        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index)
    {
        if(index<=0)
            return -1;
        for(int i=1;i<index;i++){
            current=current.getNext();
        }
        return current.getData();
    }
    Node current=head;

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty(){
        return head==null;
    }
    //remove
    public void remove(){
        //remove from the back of the list
        Node current=head;
        while (current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }
}
