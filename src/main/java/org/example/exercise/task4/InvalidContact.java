package org.example.exercise.task4;

public class InvalidContact extends RuntimeException {
    public InvalidContact(String message)
    {
        super(message);
    }
}
class ContactNotFound extends RuntimeException{
    public ContactNotFound(String message){
        super(message);
    }
}