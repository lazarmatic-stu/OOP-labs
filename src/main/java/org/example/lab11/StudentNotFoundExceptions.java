package org.example.lab11;

public class StudentNotFoundExceptions extends Exception {
    public StudentNotFoundExceptions (String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException (String message){
        super(message);
    }
}

class InvalidStudentDataException extends Exception{
    public InvalidStudentDataException(String message){
        super(message);
    }
}
