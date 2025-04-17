  import java.util.*;
  public class library{
    private Map<String, book> books;
    private Map<String, user> users;

    public library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(book b) {
        books.put(b.getID(), b);
    }
    public void addUser(user u) {
        users.put(u.getID(), u);
    }
    


  }