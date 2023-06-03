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

 // This is the driver class of the mess management system.


public class MessManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        
        //Setting visible the JFrame forms
         StudentPortal a=new StudentPortal();
         a.setVisible(true);
         
         
          WorkerPortal b=new WorkerPortal();
         b.setVisible(true);
         
         ManagerPortal c=new ManagerPortal();
         c.setVisible(true);
         
         Grocery d=new Grocery();
         d.setVisible(true);
         
         ComplaintPortal e=new ComplaintPortal();
         e.setVisible(true);
    }
    
}
