package org.example.lab3;

public class TaskItem {

    int task_id;
    String task_description;
    Status task_status;

    public TaskItem(int task_id , String task_description , Status task_status){

        this.task_id = task_id;
        this.task_description = task_description;
        this.task_status = task_status;
    }

    public static void main(String[] args){
    }

    public void displayTask(){
        System.out.println("Task id: " + task_id);
        System.out.println("Task description: " + task_description);
        System.out.println("Task status: " + task_status);
    }
}
