package Trip;

import java.util.ArrayList;

public class Trip {
	public int uniqueId;
    public String thankYouNote;
    public TravelAgent agent;
    public ArrayList<Traveler> travelers;
    public Itinerary itinerary;
    public ArrayList<Reservation> reservations;
    public Bill bill;
    private State state;

    public Trip(int uniqueId) {
        this.setState(new AwaitTravelersState(this));
        this.uniqueId = uniqueId;
    }

    public int getUniqueId() {
        return uniqueId;
    }
    public String getThankYouNote() {
        return this.thankYouNote;
    }
    public void setThankYouNote(String noteToAdd) {
        this.thankYouNote = noteToAdd;
    }
    public TravelAgent getAgent() {
        return agent;
    }
    public void setAgent(TravelAgent agent) {
        this.agent = agent;
    }
    public ArrayList<Traveler> getTravelers() {
        return travelers;
    }
    public void setTravelers(ArrayList<Traveler> travelers) {
        this.travelers = travelers;
    }
    public void addTraveler(Traveler traveler) {
        
        String thisName = traveler.getName();
        
        for (Traveler alreadyIncluded : travelers) {
            if (alreadyIncluded.getName().equalsIgnoreCase(thisName)) {
                return;
            }
        }
       
        travelers.add(traveler);
    }
    public void removeTraveler(Traveler traveler) {
        
        for (Traveler alreadyIncluded : travelers) {
            if (alreadyIncluded.getName().equalsIgnoreCase(traveler.getName())) {
               
                travelers.remove(alreadyIncluded);
                return;
            }
        }
    }
    public Itinerary getItinerary() {
        return this.itinerary;
    }
    public void setItinerary(Itinerary itineraryToAdd) {
        if (this.itinerary != null) {
            removeItinerary();
        }
        this.itinerary = itineraryToAdd;
    }
    public void removeItinerary() {
        this.itinerary = null;
    }
    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }
    public void setReservations(ArrayList<Reservation> newReservations) {
        this.reservations = newReservations;
    }
    public void addReservation(Reservation reservationToAdd) {
        if (this.reservations == null) {
            this.reservations = new ArrayList<>();
        }
        this.reservations.add(reservationToAdd);
    }
    public void removeReservation(Reservation reservationToRemove) {
        if (reservations.contains(reservationToRemove)) {
            reservations.remove(reservationToRemove);
        }
    }
    public void clearAllReservations() {
        this.reservations = null;
    }
    public Bill getBill(){
        return this.bill;
    }
    public void setBill(Bill newBill){
        this.bill = newBill;
    }
    public void removeBill() {
        this.bill = null;
    }
    public State getState() {
        return this.state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void advanceState() {
        this.state = state.advanceState();
    }
    @Override
    public String toString() {
       
        String completedString = String.format("%s:\tAgent: %s. ", uniqueId, agent.getName());
        
        if (this.travelers.size() > 0) {
          
            completedString += String.format("%s traveler", this.travelers.size());
           
            if (this.travelers.size() > 1) {
                completedString += "s";
            }
           
            completedString += ":";
          
            for (int i = 0; i < (travelers.size()); i++) {
               
                completedString = completedString + " " + travelers.get(i) + ",";
            }
          
            completedString = completedString.substring(0, completedString.length() -1) + ". ";
        } else {
            completedString += "No travelers added. ";
        }
        completedString = completedString + "State: " + state;
        return completedString;
    }

}
