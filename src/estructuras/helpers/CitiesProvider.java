package estructuras.helpers;

import java.util.ArrayList;
import java.util.List;

public class CitiesProvider {
    public static ArrayList<City> getCityList() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(new City("Mazatlan", "Mexico"));
        cities.add(new City("Los Angeles", "USA"));
        cities.add(new City("Durango", "Mexico"));
        cities.add(new City("Toronto", "Canada"));
        cities.add(new City("Berlin", "Alemania"));
        cities.add(new City("New York", "USA"));
        cities.add(new City("Guadalajara", "Mexico"));
        cities.add(new City("Dallas", "USA"));
        return cities;
    }
}
