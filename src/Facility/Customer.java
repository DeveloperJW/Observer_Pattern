package Facility;

import java.util.ArrayList;

public class Customer implements Observer {
    private String customerId;
    private String name;
    //private String lastName;
    private String contactNumber;
    private String address;
    private String ssn;

    public Customer(){
        //default constructor
    }

    //methods
    public String getCustomerId(){
        return customerId;
    }

    public void setCustomerId(String newCustId){
        this.customerId=newCustId;
    }

    public String geName(){
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAdd){
        this.address=newAdd;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(String newNum){
        this.contactNumber=newNum;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String newSsn){
        this.ssn=newSsn;
    }

    public String toString(){
        String result="";
        result="CustomerName: "+this.name+"\n";
        result+="CutomerAddress: "+this.address+"\n";
        result+="Customer Contact Number: "+this.contactNumber+"\n";

        return result;
    }

    /**
     * Method added for Observer Pattern
     *
     */
    public void checkFacility(ArrayList<Facility> facilities){
        for (int i=0; i<facilities.size();i++){
            if(name.compareTo(facilities.get(i).getCustomername())==0){
                System.out.println(name+ ": "+facilities.get(i).getFacilityInformation());
            }
        }
    }

    @Override
    public void update(Object obj){
        if (obj instanceof FacilityManagement){
            FacilityManagement facilityManagement=(FacilityManagement) obj;
            checkFacility(facilityManagement.getFacilityArrayList());
        }
    }
}