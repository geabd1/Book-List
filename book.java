import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class Book {
    private String id;
    private String bookName;
    private String genre;
    private String author;
    private boolean isAvailable;
    private int totalPageCount;
    private int currentPage;
    private int rating;

    
    public Book(String id, String bookName, String genre, 
    String author, int totalPageCount, int rating){
        this.id = id;
        this.bookName = bookName;
        this.genre = genre;
        this.author = author;
        this.isAvailable = true;
        this.totalPageCount = totalPageCount;
        this.currentPage = 0;
    }

    // Getters and Setters
    public String getID(){
        return id;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public int getTotalPageCount() {
        return totalPageCount;
    }
    
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
    
    public int getCurrentPage() {
        return currentPage;
    }
    
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
}