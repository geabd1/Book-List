import java.util.ArrayList;
import java.util.List;

public class user{

    private String name;
    private String id;
    private List<String> borrowedBooks;
    private List<String> readingHistory;

    public user(String name, String id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
        this.readingHistory = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public List<String> getBorrowedBooks(){
        return borrowedBooks;
    }
    public List<String> getReadingHistory(){
        return readingHistory;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setID(String id){
        this.id = id;

    }
    public void setBorrowedBooks(List<String> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }
    public void setReadingHistory(List<String> readingHistory){
        this.readingHistory = readingHistory;
    }

    public void borrowBook(String bookId) {
        borrowedBooks.add(bookId);
    }
    
    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
        readingHistory.add(bookId);
    }
}