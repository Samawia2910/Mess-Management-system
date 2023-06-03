/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

/**
 *
 * @author hp
 */

import java.util.Scanner;
import java.util.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;


/**here is the class named Student.It is the representation 
  * of the project mess management in which one class is student
  * Student has the following define attributes
  * Here are also defined its getter setters or constructors
  */
public class Student {
    
    private String name;
    private String email;
    private String id;
    private int cellNo;
    
   
      
  //here are the getter or setters or constructors of the above
  //defined attributes of class student
    
  
     /**parametrized Constructor
     public Student(String name,String email,String id,int cellNo){
         this.name=name;
         this.email=email;
         this.id=id;
         this.cellNo=cellNo;
     }*/
    
    
    
    
 //getters
    
    /**
     * This getter is used to get name
     * @param is not passed
     * @return String name
     */
      public String getname(){
        return name;
    }
      
     /**
     * This getter is used to get email
     * @param is not passed
     * @return String email
     */
      public String getemail(){
        return email;
    }
      
     /**
     * This getter is used to get id
     * @param is not passed
     * @return String id
     */
       public String getid(){
        return id;
    }
    
     /**
     * This getter is used to get cellNo
     * @param is not passed
     * @return int cellNo
     */
      
        public int getcellNo(){
        return cellNo;
    }
        
                                              //*SETTRERS*//
        
     /**
     * This function is use to set name
     * @param String a
     * @return Boolean flag
     */
    public boolean setname(String a)
    {
        boolean flag=isValidname(a);
        if(flag==true)
        {
            name=a;
        }
        else
        {
            name=null;
        }
        return flag;
    }
         
      /**
     * This function is used to set email
     * @param String a
     * @return Boolean flag
     */
    public boolean setemail(String a)
    {
        boolean flag=isValidemail(a);
        if(flag==true)
        {
            email=a;
        }
        else
        {
            email=null;
        }
        return flag;
    }
     /**
     * This function is used to set id
     * @param String a
     * @return Boolean flag
     */
    public boolean setid(String a)
     {
        boolean flag=isValidid(a);
        if(flag==true)
        {
            id=a;
        }
        else
        {
            id=null;
        }
        return flag;
    }
    /**
     * This function is used to set cellNo
     * @param int a
     * @return Boolean flag
     */
    
     public boolean setcellNo(int a)
     {
        boolean flag=isValidcellNo(a);
        if(flag==true)
        {
            cellNo=a;
        }
        else
        {
            cellNo=0;
        }
        return flag;
    }
     
     
  //##VALIDATORS##//
 /**
     * Validation of name
     * @param String name
     * @return Boolean flag
     */
     public boolean isValidname(String name)
    {
               
        boolean flag=false;
        for(int i=0;i<name.length();i++)
        {
            if((name.charAt(i)>='a' && name.charAt(i)<='z' ) ||(name.charAt(i)>='A' && 
              name.charAt(i)<='Z')||(name.charAt(i)==' '))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }   
        }
        return flag;
    }
     
     /**
     * validation of email
     * @param String email
     * @return Boolean flag
     */
       public boolean isValidemail(String email)
    {
               
        boolean flag=false;
        for(int i=0;i<email.length();i++)
        {
            if((email.charAt(i)>='a' && email.charAt(i)<='z' ) ||(email.charAt(i)>='A' && 
              email.charAt(i)<='Z'))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }   
        }
        return flag;
    }
     /**
     * validation of id
     * @param String id
     * @return Boolean flag
     */
       
   public boolean isValidid(String id)
  {
    
    boolean flag=false;
    for(int i=0;i<id.length();i++)
    {
      if((id.charAt(i)>='a' && id.charAt(i)<='z' ) ||(id.charAt(i)>='A' && 
              id.charAt(i)<='Z')||(id.charAt(i)==' '))
      {
        flag=true;
        
      }
      else
      {
        flag=false;
        break;
      }
    }
 
    return flag;

  }
    /**
     * validation of cellNo
     * @param int cellNo
     * @return Boolean flag
     */
   public boolean isValidcellNo(int cellNo)
    {
        boolean flag=false;
        if(cellNo>=0 && cellNo<=9)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        return flag;
    }
   
   //here ois the creation of list od students and  
   
   private static Student instance;
    
    private List<Student> students; 
    
    
    /**
     * constructor of class student which initializes the arraylist 
     * of students
     */
    
    private Student(){
        students = new ArrayList<Student>();
    }
    
    public static Student getInstance(){
        if(instance==null)
        {
            instance = new Student();
        }
        
        return instance;
    }
    
    /**Saving the data of students in the file named StudentData 
     */
     public void saveData(String StudentData)
    {
        try {
            FileWriter fw = new FileWriter(StudentData);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Name,Email,id,cellNo\n");
            
            for(int i = 0 ; i < students.size();i++)
            {
                bw.write(students.get(i).getname() + ", "+
                        students.get(i).getemail() + ","+
                        students.get(i).getid()+","+
                        students.get(i).getcellNo()+","+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     }
