/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daa;

/**
 *
 * @author Nitu
 */
public class Contact implements Comparable<Contact>{
    int id;
    String number;
    String fname;
    String lname;
    Priority priority;
    
    public Contact(int id,String number,String fname,String lname,Priority priority){
        this.id = id;
        this.number = number;
        this.fname = fname;
        this.lname = lname;
        this.priority = priority;
    }
    
    @Override
    public int compareTo(Contact c){
        if(this.getPriority().compareTo(c.getPriority())!=0)
            return this.getPriority().compareTo(c.getPriority());
        
        else if(this.getFname().compareTo(c.getFname())!=0)
            return this.getFname().compareTo(c.getFname());
        
        else
            return this.getLname().compareTo(c.getLname());
    }
    
    @Override
    public String toString(){
        return "\nContact id: "+id+", First Name: "+fname+", Last Name: "+lname+", Phone number: "+number+", Priority: "+priority;
    }
    
    public int getId() {
        return id;
    }
    
    public Priority getPriority(){
        return priority;
    }
    
    public String getFname(){
        return fname;
    }
    
    public String getLname(){
        return lname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
