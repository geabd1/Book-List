import java.util.ArrayList;
import java.util.List;

public class User{

    private String name;
    private String id;
    private String password;
    private List<String> borrowedBooks;
    private List<String> readingHistory;

    public User(String name, String id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
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
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
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

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (String bookId : borrowedBooks) {
            System.out.println(bookId);
        }
    }
}