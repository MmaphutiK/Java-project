/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ST10142683
 */

            public class showReport {

           public static int taskDu[];//Stores the time duration of each task object
           public static String tName [];//Stores the name of each task object
           public static String devName [];//Stores the developer name of each task object
           public static String taskStat[];//Stores the task status of each task object
           public static  String taskID[];//Stores the task ID of each task object 

    

     public static String findingTaskName(String detailedName) {//searches for the task names 
      
      String theDetails="";
      
       for(int i=0;i<tName.length;i++){
        
           if(detailedName.equals(tName[i])){
            
             theDetails+=devName[i]+" "+tName[i]+"  "+taskStat[i]+"\n";
           }

       }
         
         return theDetails; 

     
     }


           
  
          
                public static String longestDuration(){//displays  details for the task with the longest deails 
           
                int maximum=taskDu[0];
                int location=0;
                 for(int b=0;b<taskDu.length;b++){
                     if (taskDu[b]>maximum){
                      maximum=taskDu[b];
                      location=b;
                     }
                 }
   
                  return devName[location]+":"+maximum;
                }
                  
        
          
          
           public static String findStatus( String developersName){
                 

                 String foundStatus="";
           for(int i=0;i<taskStat.length;i++){
              if (devName[i].equals(taskStat[i])){
              foundStatus +=tName [i]+" \n  "+devName[i]+"\n"+taskStat[i]+"\n";
              }
              
          }
    
         return foundStatus;
}

    /**
     *
     * @param deleteTaskName
     */
    public static void deletingTasks(String deleteTaskName){//deletes task using task name
             
             int adjustedTaskDuration[] =new int [taskDu.length-1];
             String adjustedTaskName[]=new String [tName.length-1];
              String adjustedTaskID[]=new String[taskID.length-1];
               String  adjustedTaskStatus[]=new String[taskStat.length-1];
                String adjusteddeveloperName[]=new String[devName.length-1];
                 
               int v=0;     
               int thePlacement=0;
                  

             for (int r=0;r<tName.length;r++) {
                       if(tName[r].equals(deleteTaskName)){
                             thePlacement=r;
                        }
                          else
                             adjustedTaskName[v]=tName[r];
                               v++;
                          }

                  int k=0;
                 for(int y=0;y<taskDu.length;y++){

                 if (thePlacement!=k){
                        
                         adjustedTaskName[k]=tName[y];
                         adjusteddeveloperName[k]=devName[y];
                         adjustedTaskID[k]=taskID[y];
                         adjustedTaskStatus[k]=taskStat[y];
                         adjustedTaskDuration[k]=taskDu[y];
                         k++;
               }


        }

                        adjustedTaskName=tName;
                        adjusteddeveloperName=devName;
                        adjustedTaskID=taskID;
                        adjustedTaskStatus=taskStat;
                        adjustedTaskDuration=taskDu;
               

}






  
     
                  
          
          
           public static String openReport(){//method that shows the report 
              String information="";
                 for(int m=0;m<devName.length;m++){
                     information+="Developer name:"+devName[m]+"\n"+"Task ID:"+taskID[m]+"\n"+"Task name :"+tName[m]+ "Task Status:"+taskStat[m]+"\n"+"Task Duration :"+taskDu[m]+"\n";
        
             }
       
          
     
              return information; 
       }



   public static String statusWithDone(){//shows the task status of each developer 
 
    
  
     String completeDetails="";
     
     for(int i=0;i<taskStat.length;i++){
        if (taskStat[i]=="Done"){
          completeDetails += devName [i]+"  "+"  "+ tName[i]+" "+taskDu[i]+"\t";
         }
     }        
               return completeDetails;
 
     
   }
   
}