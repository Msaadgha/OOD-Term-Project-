package Clients;

public class Traveler extends Customer {

    /**
     * Traveler's favorite drink
     */
    private final String favoriteDrink;
	private String mobilePhone;
	private String name;

    

    public Traveler(String name, String mobilePhone, String favoriteDrink) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.favoriteDrink = favoriteDrink;
    }

    public String getName() {
        return this.getName();
    }

    
    public String getMobilePhone() {
        return this.getMobilePhone();
    }

   
  
    public String getFavoriteDrink() {
        return this.favoriteDrink;
    }

}
