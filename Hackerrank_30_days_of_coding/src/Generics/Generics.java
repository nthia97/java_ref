package Generics;

public class Generics {

    public static <E> void displayArray(E[] array){
        System.out.print("[");
        for(E e:array)
            System.out.print(e+",");
        System.out.println("]");
    }

    public static <T extends Comparable<T>> T findMax(T a,T b){
        int n=a.compareTo(b) ;
        if(n<0){
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6};
        displayArray(arr);

        System.out.println(findMax(2,3));
        System.out.println(findMax(3,3));
        System.out.println(findMax(3,2));

        System.out.println(findMax(2.0,3.0));
        System.out.println(findMax('a','b'));
        System.out.println(findMax("hello","there"));
    }
}
