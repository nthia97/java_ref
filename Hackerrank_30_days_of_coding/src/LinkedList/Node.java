package LinkedList;

public class Node {
    Node next;
    int data;

    //constructors
    Node(int newData)
    {
        data=newData;
    }

    Node(int newData,Node newNext)
    {
        data=newData;
        next=newNext;
    }

    //Getters and setters
    public int getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setData(int newData)
    {
        data=newData;
    }

    public void setNext(Node newNode)
    {
        next=newNode;
    }

}
