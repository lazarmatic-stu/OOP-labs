package org.example.lab3;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {

    private List<TaskItem> tasks = new ArrayList<>();
    public TaskItem completed_tasks;
    public DataStructures(){

        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to GitHub" , Status.TO_DO) ,
                new TaskItem(2,"Prepare for the quiz" , Status.IN_PROGRESS) ,
                new TaskItem(3 , "Do the tasks from lab 2" , Status.COMPLETED)
        );

    }

    public void getAllObjects(){
        for (TaskItem task : tasks){
            task.displayTask();
            System.out.println();
        }
    }

    public void getByStatus(Status status){
        for (TaskItem task : tasks){
            if (task.task_status == status)
                task.displayTask();

        }
    }

    public void idGreaterThanTwo(){
        for (TaskItem task : tasks){
            if (task.task_id >= 2)
                task.displayTask();

        }
    }

    public void getDescription(){
        for (TaskItem task : tasks){
            System.out.println("For task with ID: " + task.task_id + " the description is: " + task.task_description);
        }
   }

    public static void main(String [] args){
        DataStructures data = new DataStructures();
        data.getDescription();
    }
}
