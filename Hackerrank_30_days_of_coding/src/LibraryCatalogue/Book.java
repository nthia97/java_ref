package LibraryCatalogue;

public class Book {
    //properties,fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //check whether or not the book is checked out
    int dayCheckedOut=-1;

    //constructor
    public Book(String bookTitle,int bookPageCount,int bookISBN){
        this.title=bookTitle;
        this.pageCount=bookPageCount;
        this.ISBN=bookISBN;
    }

    //getters->INSTANCE METHODS
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    //setters

    public void setCheckedOut(boolean newcheckedOut,int currentDayCheckedOut) {
        this.isCheckedOut = newcheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut=day;
    }
}
