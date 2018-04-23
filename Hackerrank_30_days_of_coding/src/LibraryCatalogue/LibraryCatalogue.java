package LibraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    //properties/fields/Global variables
    Map<String,Book> bookCollection =new HashMap<String,Book>();
    int currrentDay=0;
    int lengthOfCheckedoutPeriod=7;
    double initialLateFee=0.50;
    double feePerLateDay=1.00;

    //constructors
    public LibraryCatalogue(Map<String, Book> collection){
        this.bookCollection=collection;
    }
    public LibraryCatalogue(Map<String, Book> collection, int lenghtOfCheckedoutPeriod, double initialLateFee, double feePerLateDay){
        this.bookCollection=collection;
        this.lengthOfCheckedoutPeriod=lenghtOfCheckedoutPeriod;
        this.initialLateFee=initialLateFee;
        this.feePerLateDay=feePerLateDay;
    }

    //Getters
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    public int getCurrrentDay() {
        return currrentDay;
    }

    public int getLengthOfCheckedoutPeriod() {
        return lengthOfCheckedoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    //Setters
    public void nextDay(){
        currrentDay++;
    }
    public void setDay(int day){
        currrentDay=day;
    }

    //INSTANCE METHODS
    public void checkOutBook(String title){
        Book book=getBook(title);
        if(book.isCheckedOut){
            sorryBookAlreadyCheckedOut(book);
        }
        else{
            book.setCheckedOut(true,currrentDay);
            System.out.println("You just checked out "+title +
                    ". It is due on "+(getCurrrentDay()+getLengthOfCheckedoutPeriod())+".");
        }

    }
    public void returnBook(String title){
        Book book=getBook(title);
        int daysLate=currrentDay-(book.getDayCheckedOut()+getLengthOfCheckedoutPeriod());
        if(daysLate>0){
            System.out.println("You owe the library $"+getInitialLateFee()+daysLate*getFeePerLateDay()+
                    " because your book is "+daysLate+" days overdue");
        }else {
            System.out.println("Book returned thank you");
        }
        book.setCheckedOut(false,-1);
    }
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, "+book.getTitle()+" is already checked out. "+
                "It should be back on day "+(book.getDayCheckedOut()+getLengthOfCheckedoutPeriod()+"."));
    }

    public static void main(String[] args) {
        //TODO code application logic
        Map<String, Book> bookCollection=new HashMap<String, Book>();
        Book harry=new Book("Harry Potter",827132,9999999);
        bookCollection.put("Harry Potter",harry);
        LibraryCatalogue lib=new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}
