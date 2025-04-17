  import java.util.*;
public class Library{
    private Map<String, Book> books;
    private Map<String, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book b) {
        books.put(b.getID(), b);
    }
    public void addUser(User u) {
        users.put(u.getID(), u);
    }
    public Book getBook(String id) {
        return books.get(id);
    }
    public User getUser(String id) {
        return users.get(id);
    }
    public void removeBook(String id) {
        books.remove(id);
    }
    public void removeUser(String id) {
        users.remove(id);
    }
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    

  }