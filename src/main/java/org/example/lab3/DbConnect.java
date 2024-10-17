package org.example.lab3;

import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "zollero0000";

    private Connection connection = null;

    public DbConnect(){
        try {
        connection = DriverManager.getConnection(CONNECTION_STRING , USERNAME , PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTasks(){
        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Task ID: " + rs.getString("task_id"));
                System.out.println("Task Description: " + rs.getString("task_description"));
                System.out.println("Task Status: " + rs.getString("task_status"));
                System.out.println();
            }
        } catch (SQLException e) { throw new RuntimeException();}
    }

    public void getTaskById(int id){
        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE task_id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
            String description = rs.getString("task_description");
            String status = rs.getString("task_status");
            System.out.println(
                    "Task with ID: " + id + " has description: " + description + " and the status is: " + status
            );}
        } catch (SQLException e){ throw new RuntimeException(e);}
    }

    public void newTask() {
        try {
            PreparedStatement statement = this.connection.prepareStatement("INSERT INTO tasks values (6,'Another task entered!!!!!' , 'COMPLETED')");
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTask(int id){
        try {
            PreparedStatement statement = this.connection.prepareStatement("UPDATE tasks SET task_description = 'UPDATED' WHERE task_id = ?");
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e){ throw new RuntimeException(e); }
    }


public static void main(String [] args){
        DbConnect db_connection = new DbConnect();
        //db_connection.newTask();
    db_connection.updateTask(5);
          db_connection.getAllTasks();
        //db_connection.getTaskById(1);

}

}
