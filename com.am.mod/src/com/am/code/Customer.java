package com.am.code;

public class Customer {
    String firstName = null;
    String lastName = null;

    public String getCustomerName(){
        String returnValue = null;
        if((this.firstName != null) && (this.lastName != null)){
            returnValue = this.firstName + " " + this.lastName;
        }else if(this.firstName != null){
            returnValue =  "N/A " + this.lastName;
        }else if(this.lastName != null){
            returnValue =  this.firstName + " N/A";
        }else{
            returnValue = "N/A N/A";
        }
        return returnValue;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

}
