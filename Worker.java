/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

/**
 * @author Hp
 */
/**
 * This is the java class of Worker .This class is inherited from Manager.
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;
import java.util.List;
import java.util.ArrayList;
public class Worker extends Manager {
    
    
    //creating list of workers
    public List<Worker> workers;
    
    /**here we will save the data of the worker in the file
     * ManagerData
     */
    public void saveData(String WorkerData)
    {
        try {
            FileWriter fw = new FileWriter(WorkerData);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Name,Email,id,cellNo\n");
            
            for(int i = 0 ; i < workers.size();i++)
            {
                bw.write(workers.get(i).getname() + ", "+
                        workers.get(i).getemail() + ","+
                        workers.get(i).getid()+","+
                        workers.get(i).getcellNo()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
           } 
}
