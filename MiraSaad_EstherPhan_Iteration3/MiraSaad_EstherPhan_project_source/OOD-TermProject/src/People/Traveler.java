package People;

public class Traveler extends Customer {
	@SuppressWarnings("unused")
	private final String customerType = "Traveler";
	private final String favoriteDrink;
	public Traveler(String name, String mobilePhone, String favoriteDrink) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.favoriteDrink = favoriteDrink;
    }
	
	 public String getName() {
	        return this.getName();
	    }
	 public String getMobilePhone() {
	        return this.mobilePhone;
	    }
	 public String getFavoriteDrink() {
	        return this.favoriteDrink;
	    }

}
