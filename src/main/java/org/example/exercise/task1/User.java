package org.example.exercise.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class User {
    private String username;
    public User(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
}
@UserPermission(userType = "Regular")
class RegularUser extends User{
    private String username;
    public RegularUser(String username){
        super(username);
    }
    @UserPermission(userType = "Regular")
    public void sendMessage(){
        System.out.println("User is restricted!");
    }
}
@UserPermission(userType = "Admin")
class AdminUser extends User{
    private String username;
    public AdminUser(String username){
        super(username);
    }
    @UserPermission(userType = "Admin")
    @CanSendMessage
    public void sendMessage(){
        System.out.println("The name of user who sent message is: " + super.getUsername());
    }
}
class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        RegularUser regular = new RegularUser("regulara");
        AdminUser admincic = new AdminUser("adminare");

        for (Method method : admincic.getClass().getDeclaredMethods()){
            if ((method.isAnnotationPresent(CanSendMessage.class))){
                method.invoke(admincic);
            }
        }
    }
}
