/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

/**
 *
 * @author DELL
 */
import java.util.Date;

public class Waiter{
private String name;
    private String id;
    private boolean busy;
    private int orderNum;
    private String contactNumber;
    private String email;
    private String cnic;
    private Date savedOn;
    
    public void setName(String name) {
        this.name = name;
        
    }
    public void setID(String id) {
        this.id = id;
        
    }
    
    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    public void setOrderNum(int orderNum){
	this.orderNum = orderNum;
	}
    public void setContactNumber(String contact) {
        this.contactNumber = contact;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCNIC(String cnic){
       this.cnic = cnic; 
    }
    public void setSavedOn(Date savedOn) {
        this.savedOn = savedOn;
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return id;
    }
    public boolean isBusy() {
        return busy;
    }
    public int orderNum(){
	return orderNum;
	}
  public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }
    public String getCNIC() {
        return cnic;
    }
     public Date getSavedOn() {
        return savedOn;
    }
    
        
    
}
