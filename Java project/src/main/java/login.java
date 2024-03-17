import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author masha
 */
public class login {

    private static String developersName;
    private static String deleteTaskName;
    private static String detailedName;
    
    //stores the username of the user
    public String username;
    //stores the password of the user
    public String password;
    //stores login status of the user
    public boolean loggedIn;
    
           public static int taskDu[];
           public static String tName [];
           public static String devName [];
           public static String taskStat[];
           public static  String taskID[];
    

   //constructor intialises the three variables
    public login(String username, String password)
    {
        this.password = password;
        this.username = username;
        this.loggedIn = false;
    
    }

    public boolean checkUserName()
    {
        //stores the availabilty status of an underscore(_) in username string
        boolean underscore  = false;
        //loop runs through the string checking if there is an underscore or not 
        for(int i = 0; i < username.length(); i++)
        {
                      
            if(username.charAt(i) == (char)95)
            {
                //if underscore is found the underscore variable is set to true
                underscore = true;
                break;
            }
        }
          /*conditional statement checks if username does not exceed 
            a maximum of 5 charactes*/
         if(username.length() <= 5 && underscore == true)
        {
            return true;
        }
        this.username = "";
        return false;
    }
    public boolean checkPasswordComplexity()
    {
    //stores availabilty status of numbers in password and is intialized to false
        boolean capitalLetter = false;
    //stores availabilty status os numbers in the paaword and is intialized to false
        boolean number = false;
    //stores availablity status of special characters in the string and is intialised to false
        boolean specialChar = false;
    //stores the size of password string 
        int size  = password.length();
        //loops runs through password string 
        for(int i = 0; i < size; i++)
        {
    //loop run through password string checking for capital letter        
       if(password.charAt(i) >= (char)65 && password.charAt(i) <= (char)90)
            {
                capitalLetter = true;
                break;
            }
        }
        
         //loop run through password string checking for numbers
         for(int i = 0; i < size; i++)
        {
            if(password.charAt(i) >= (char)48 && password.charAt(i) <= (char)57)
            {
                number = true;
                break;
            }
        }
        
        for(int i = 0; i < size; i++)
        {
            //loop run through password string checking for availabity of special characters
            if(password.charAt(i) >= (char)33 && password.charAt(i) <= (char)47 || password.charAt(i) >= (char)58 && password.charAt(i) <= (char)64 || password.charAt(i) >= (char)91 && password.charAt(i) <= (char)96 || password.charAt(i) >= (char)123 && password.charAt(i) <= (char)126)
            {
                {
                    specialChar = true;
                    break;
                }
            }
            
        }
        //conditional statements then verifies if all conditions are satisfied and if so password is accepted otherwise rejected ,user prompted to enter a another one
        if(size >= 8 && number && specialChar && capitalLetter)
        {
            return true;
        }
        else
        {
            this.password = "";
            return false;
        }
    }
    public String registerUser()
    {
        //conditional statement prints out message if password condition not met
        if(checkPasswordComplexity() == false)
        {
            return "Unable to register user due to invalid password!";
        }
        //conditional statement prints out message if username conditions not met
        else if(checkUserName() == false)
        {
            return "Unable to register user due to invalid username!";
        }
        else
        {
            return "The user has been registered successfully!";
        }

    }
    public boolean loginUser(String username, String password)
    {
        //intialises the loggedIn variable to true if the entered username and password match the registered one
        if(username.equals(this.username) && password.equals(this.password))
        {
            loggedIn = true;
            return true;
        }
        return false;
    }
    public String returnLoginStatus(String username, String password)
    {
        //if loggedIn is true the user sucessfully logged in
        if(loggedIn)
        {
            return "A successful login";
        }
        else
        {
            return "A failed login";
        }
    }
    //returns the login statuds of the user as a boolean 
    public boolean ifIsLoggedIn()
    {
        return loggedIn;
    }
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int taskCounter = 0;
        //user is prompted to enter user name
        System.out.println("1. Username must have at most 5 characters and the underscore(_) character.\n");
        System.out.print("Please enter your username: ");
        String username = obj.nextLine();
        System.out.println("\n1. Password must have the following:\n2. At least eight characters long.\n3. Contain a capital letter\n4. Contain a number\n5. Contain a special character\n");
        System.out.print("Please enter your password: ");
        String pass = obj.nextLine();
        
        //user is prompted to enter password
        login newUser = new login(username,pass);
        if(newUser.checkUserName())
        {
            System.out.println("Username is valid");
        }
        else
        {
            System.out.println("Username is not valid");
        }
        if(newUser.checkPasswordComplexity())
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is not valid");
        }
        System.out.println(newUser.registerUser());
         //if login is successful the user is then allowed in the system
        String taskStatus = "";

        //if(newUser.ifIsLoggedIn())
        //{
            int choice;
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban\n");

            choice= Integer.parseInt(JOptionPane.showInputDialog("Option 1) Add tasks" +'\n' + "2) view report" +'\n' + "3) quit"));

            
            int numTasks = 0;
            int status=0;

         
            int counter = 0;
            String taskName = "";
            int taskDuration =0;
            String dev = "";
            String taskDescription = "";
            int select=0;
            int numberOfTasks=0;
            int theSizeOfTheArray=0;
            String taskId="";
            
             //user prompted to enter required input 
           // Scanner ob = new Scanner(System.in);
            
            boolean easyKan=true;
            while( easyKan==true)
            {
               // ob = new Scanner(System.in);
               
              
               
                  if (choice ==1){
                     numberOfTasks=Integer.parseInt(JOptionPane.showInputDialog("how many tasks do you want to add")); 
                     theSizeOfTheArray+=numberOfTasks;
                     
                     for (int a=0; a< numberOfTasks; a++){
                        numberOfTasks++;
                        
                        taskName= JOptionPane.showInputDialog("Enter the name of the task: ");
                        taskDuration=Integer.parseInt(JOptionPane.showInputDialog("Enter the time duration of the task: "));
                        dev = JOptionPane.showInputDialog("Enter the name of the developer: ");
                        taskDescription=JOptionPane.showInputDialog("Enter the description of the task: ");
                        JOptionPane.showMessageDialog(null, "Task successfully captured");
                        taskStatus=JOptionPane.showInputDialog("Enter the status of the task.\nSelect\nOption 1: To Do.\nOption 2: Done.\nOption 3: Doing.\nChoice: ");
                
              
                taskDu= new int[theSizeOfTheArray];
               tName= new String [theSizeOfTheArray];
               taskID= new String [theSizeOfTheArray];
              taskStat= new String[theSizeOfTheArray];

                        
                if(status== 1)
                {
                    taskStatus = "To Do";
                }   
                else if(status== 2)
                {
                    taskStatus = "Done";
                }  
                else if(status == 3)
                {
                    taskStatus = "Doing";
                }
                  
              
                
                Task2 task = new Task2();
               
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(null,"Now displaying results...");
                
                
              
                 taskDu[a]= taskDuration;
               tName[a]= taskName;
               taskID[a]= taskId;
              taskStat[a]=taskStatus;
                  }}
              
            
              int number=0;
             if(choice==2){
                
             


              number=Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1.) To show the developer name,task names and task duration for all the tasks the diplay the status done.\n"
                       + "Press 2) To show the developer and duration of th class with the longest duration.\n"
                       + "Press 3)To  find the task with the task name then show the task name,developer name and task status.\n"
                       + "Press 4)To find  all the tasks assigned under the developer  name and display the task name and task status. \n"
                       + "Press 5)To  delete a task with the task name \n"
                       +"Press  6) To show the report that lists the complete  detaila of all captured tasks.\n"
                       +"Press  7) To exit"));
                
                      
                    
                        
                    if(number==1){
                         JOptionPane.showMessageDialog(null,showReport.statusWithDone());
                    }
                    else  if(number==2){
                    JOptionPane.showMessageDialog(null,showReport.longestDuration());
                     }
                     else if(number==3){//prompt user to add task name
                         JOptionPane.showInputDialog(null,"Enter the name of the task you looking for");
                         JOptionPane.showMessageDialog(null,showReport.findingTaskName( detailedName));
                     }
                     else if(number==4){//prompt developer to add name
                         JOptionPane.showInputDialog(null,"Enter the name of developer");
                         JOptionPane.showMessageDialog(null,showReport.findStatus(developersName));
                     }
                     else if(number==5){// prompting use to put name of tak they want delete 
                        JOptionPane.showInputDialog(null,"Enter task name you want to delete");
                        
                     }
                     else if(number==6){//opens file of the report 
                     JOptionPane.showMessageDialog(null,showReport.openReport());
                    }
                    
                   
                   else if(number==7){
                   
                          System.exit(0);\\user will exit app 
                   }
                   else{
                        
                    
                    
                   }
                           
                      JOptionPane.showMessageDialog(null,"thank you for using EasKanBan,please do reccomend us to your friends");
                
                   }             

  

 
            }}}

 




        


    
    
    

