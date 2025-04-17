public class Users {
    private User[] users;
    private int totalUsers;

    public Users() {
        this.users = new User[100]; // Assuming a maximum of 100 users
        this.totalUsers = 0;
    }

    public void addUser(User u) {
        if (totalUsers < users.length) {
            users[totalUsers++] = u;
        } else {
            System.out.println("User limit reached.");
        }
    }
    public void showAllUsers() {
        for (int i = 0; i < totalUsers; i++) {
            System.out.println("User ID: " + users[i].getID());
            System.out.println("User Name: " + users[i].getName());
            System.out.println("-----------------------------");
        }
    }

    public int getTotalUsers() {
        return totalUsers;
    }
}
