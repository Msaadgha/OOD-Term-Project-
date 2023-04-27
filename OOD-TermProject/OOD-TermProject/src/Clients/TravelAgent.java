package Clients;

public class TravelAgent extends Person {
    
 private final String name;
 private final String mobilePhone;
 private final String username;

    
    public TravelAgent(String name, String mobilePhone, String username){
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.username = username;
    }

    
    public String getName() {
        return name;
   
    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getUsername() {
        return username;
    }
}