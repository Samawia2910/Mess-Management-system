/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

/**
 *
 * @author hp
 *
 */
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;
public class Manager {
    
    /**
     * This is the class of manager .In this class, data 
     * of managers are saved in the file ,they are stored in the list.
     * Manager class manages the record of manager in the mess management system.
     */
    
    
    public String name;
    public String email;
    public String id;
    public int cellNo;
    
    
    public void setname(String name)
    {
        this.name=name;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    
    public void setid(String id)
    {
        this.id=id;
    }
    
    public void setcellNo(int cellNo)
    {
        this.cellNo=cellNo;
    }
     public String getname() {
        return name;
    }
      public String getemail() {
        return email;
    }
       public String getid() {
        return id;
    }
        public int getcellNo() {
        return cellNo;
    }
    
    
    public static Manager instance;
    
     public List<Manager> managers; 
    
    /**
     * Constructor of Manager class
     */
     
    public Manager(){
         managers = new ArrayList<Manager>();
    }
    
    //
     public static Manager getInstance(){
        if(instance==null)
        {
            instance = new Manager();
        }
        
        return instance;
    }
     
     /**
      * Saving data of managers in file name 
      */
     
      public void saveData(String ManagerData)
    {
        try {
            FileWriter fw = new FileWriter(ManagerData);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Name,Email,id,cellNo\n");
            
            for(int i = 0 ; i < managers.size();i++)
            {
                bw.write(managers.get(i).getname() + ", "+
                        managers.get(i).getemail() + ","+
                        managers.get(i).getid()+","+
                        managers.get(i).getcellNo()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

