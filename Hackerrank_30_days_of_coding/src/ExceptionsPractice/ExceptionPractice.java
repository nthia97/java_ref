package ExceptionsPractice;

public class ExceptionPractice {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            System.out.println("Element 6 at index 5 = "+arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }

        finally {
            System.out.println("Finally clause ");
        }
        System.out.println("Finally finished try-catch");

    }
}
