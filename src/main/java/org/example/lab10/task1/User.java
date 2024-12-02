package org.example.lab10.task1;

 public abstract class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }
}

class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }
}

