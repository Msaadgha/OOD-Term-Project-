package People;

public class TravelAgent extends Person {
	private String username;

	public TravelAgent(String name, String mobilePhone, String username){
		this.name = name;
        this.mobilePhone = mobilePhone;
        this.username = username;
	    }
	
	public String getName() {
        return name;
    }
	
	public String getMobilePhone() {
        return mobilePhone;
    }
	
    public String getUsername() {
        return username;
    }

}
