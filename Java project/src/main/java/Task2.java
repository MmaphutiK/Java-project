/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ST10142683
 */
public class Task2 {
    
    

    int taskNumber;//Stores the task number of each task object
    String taskDescription;//Stores the description of each task object
    String taskID;//Stores the task ID of each task object 
    String taskName;//Stores the name of each task object
    String taskDuration;//Stores the time duration of each task object
    String taskStatus;//Stores the task status of each task object
    String devDetails;//Stores the name and surname of each task class object 

//Constructor initializes the variable with user input

    /**
     *
     * @param dev
     * @param taskName
     * @param taskDescription
     * @param taskStatus
     * @param taskDuration
     * @param taskNumber
     */
    public Task2(String dev, String taskName,String taskDescription, String taskStatus,String taskDuration, int taskNumber)
    {
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.taskDuration = taskDuration;
        this.taskNumber = taskNumber;
        this.taskName = taskName;
        this.devDetails = dev;
    }

    Task2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean checkTaskDescription(){//Checks if the description length conditions is satisfied and returns a boolean
    
      if(taskDescription.length() < 50) {
      }  
      
        return true; 
      }
      
    

    public String createTaskId() // Creates and returns taskID as a string 
    {
        String temp = taskName.substring(0,2);

        temp += (":" + 20 + ":" + taskName.substring(taskName.length() - 3));

        return temp;
    }
    public String printTaskDetails()//Print out the data store in the class variables
    {
        String taskName = "Task Name: " + this.taskName + "\n";
        String taskNumber = "Task Number: " + this.taskNumber + "\n";
        String taskDescription = "Task Description: " + this.taskDescription + "\n";
        String devDetails = "Developer Details: " + this.devDetails + "\n";
        String taskDuration = "Task Duration: " + this.taskDuration + "\n";
        String taskID = "TaskID: " + this.createTaskId() + "\n";
        String taskStatus = "Task Status: " + this.taskStatus + "\n";

        return (taskName + taskNumber + taskDescription + devDetails + taskDuration + taskID + taskStatus);
    }
    public int returnTotalHours(int taskDuration)//Returns the number of total number of hours assigned for each task
    {
        return  taskDuration;
    }
    
}

            
    
    

