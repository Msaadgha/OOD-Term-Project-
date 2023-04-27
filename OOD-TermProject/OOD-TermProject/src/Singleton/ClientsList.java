package Singleton;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Clients.Customer;
import Clients.Person;
import Clients.Traveler;

public class ClientsList {
    private static ClientsList uniqueInstance = new ClientsList();
    private static final String peopleFile = "term_project/src/main/java/com/termproject/Singleton/people.txt";
    ArrayList<Customer> personList = new ArrayList<>();

    private ClientsList() {
        loadPersonFile();
    }

    private void loadPersonFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(peopleFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String mobilePhone = data[1];
                String favoriteDrink = data[2];
                Person person = new Person();
				person.add(new Traveler(name, mobilePhone, favoriteDrink));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ClientsList getInstance() {
        return uniqueInstance;
    }
}
