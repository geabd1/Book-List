//for this file, if an admin logs in, they can see all the users and their details
public class Admin {
    private Users users;
    private Library library;
    private int totalUsers;
    private String id;
    private String password;

    public Admin(String id, String password, int totalUsers) {
        this.id = id;
        this.password = password;
        this.totalUsers = totalUsers;
        this.users = new Users();
        this.library = new Library();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getTotalUsers() {
        return users.getTotalUsers();
    }
    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    


    
}
