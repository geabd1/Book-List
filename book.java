import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book
{
    private int id;
        private String bookName;
        private String genre;
        private String author;
        private String status; //reading, want to, read
        private boolean isAvailable;
        private int totalPageCount;
        private int currentPage;
        private int rating;
        private List<review> review;


        
        
        public book(int id, String bookName, String genre, 
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

        public int getID(){
            return id;
        }
        public void setID(int id)
        {
            this.id = id;
        }




}