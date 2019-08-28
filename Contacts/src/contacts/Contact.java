/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    // Gets First Name
    public String getFirstName(){
        
      return this.firstName;
    }
    
    // Change First Name Method
    public void setFirstName(String firstName){
        
        this.firstName = firstName;
    }
    
    // Gets Last Name;
    public String getLastName(){
        
      return this.lastName;
    }
    
    // Change Last Name Method
    public void setLastName(String LastName){
        
        this.lastName = lastName;
    }
    
    // Gets Phone Number;
    public String getPhoneNumber(){
        
      return this.phoneNumber;
    }
    
    // Change Phone Number Method
    public void setPhoneNumber(String phoneNumber){
        
        this.phoneNumber = phoneNumber;
    }
    
    // Gets Email Address;
    public String getEmailAddress(){
        
      return this.emailAddress;
    }
    
    // Change Email Address Method
    public void setEmailAddress(String emailAddress){
        
        this.emailAddress = emailAddress;
    }
    
    // Sends/Returns String of contact info
    public String toString(){
        return firstName + " " + lastName + " " + phoneNumber + " " + emailAddress;
    }
}
