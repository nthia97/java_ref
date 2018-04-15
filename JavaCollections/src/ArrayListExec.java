import javax.swing.event.CaretListener;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExec {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<Car>();

        Car c=new Car("H234");

        carList.add(c);
        System.out.println(carList.size());

        //add(int index,E e)
        for (int i=0;i<5;i++){
            carList.add(new Car("H"+i));
        }

        carList.add(4,new Car("H335"));
        System.out.println(carList.toString());

        // Iterator
        Iterator<Car> carIterator=carList.iterator();
        while (carIterator.hasNext())
            System.out.println(carIterator.next());

        //clone() method
        ArrayList<Car> carList2=(ArrayList<Car>)carList.clone();

        Iterator<Car> carIterator2=carList2.iterator();
        while (carIterator2.hasNext())
            System.out.println("--->"+carIterator2.next());

        //contains(Object o)
        System.out.println("Does carlist contain H234 "+carList2.contains("H234"));

        //get index
        System.out.println(carList.get(4));

        //isEmpty
        if(carList.isEmpty())
            System.out.println("Carlist is empty");
        else
            System.out.println("Carlist is not empty");

        //indefOf(Object o)
        System.out.println("index of H4 is "+ carList.indexOf(new Car("H4")));

        ArrayList<Car> carList3= new ArrayList<Car>();
        carList3.ensureCapacity(300);
        long startTime=System.nanoTime();
        for(int i=0;i<=100;i++)
            carList3.add(new Car("H"+(i+10)));

        System.out.println("Elpased Time -no ENSURE CAPACITY-"+(System.nanoTime()-startTime));

    }
}
