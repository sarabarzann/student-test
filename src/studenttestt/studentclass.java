/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttestt;

/**
 *
 * @author SherdllStore
 */
public class studentclass {
    private static int idd=1;
    private int id;
    private final String  department= "CS";
    private String name;
     private int semester;
     public studentclass(String name,int semester){
         this.id=idd++;
         this.semester=semester;
         this.name=name;
         
     }
  
   public  int getid(){
       return id;
   }
    public  String getdepartment(){
       return department;
   }
     public  String getname(){
       return name;
   }
      public  int getsemester(){
       return semester;
   }
      public void display(){
          System.out.println("studentid:"+getid());
           System.out.println("department: "+getdepartment());
            System.out.println("studentname:"+getname());
             System.out.println("semester:"+getsemester()+"\n");
      }
     
}
