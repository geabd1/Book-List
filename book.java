import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class book {
    private String id;
    private String bookName;
    private String genre;
    private String author;
    private String status; //reading, want to, read
    private boolean isAvailable;
    private int totalPageCount;
    private int currentPage;
    private int rating;
    private List<review> review;
    
    public book(String id, String bookName, String genre, 
    String author,String status, int totalPageCount, int rating){
        this.id = id;
        this.bookName = bookName;
        this.genre = genre;
        this.author = author;
        this.status = status;
        this.isAvailable = true;
        this.totalPageCount = totalPageCount;
        this.currentPage = 0;
        this.review = new ArrayList<>();
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
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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
    
    public List<review> getReview() {
        return review;
    }
    
    public void setReview(List<review> review) {
        this.review = review;
    }
}