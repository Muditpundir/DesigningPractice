package DesignPatternPractice.CarRental.RentalManagement;

public class StoreLocation {

    public StoreLocation(String country, String state, String city, int zipcode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
    }

    public  String country;
    public  String state;
    public  String city;
    public  int zipcode;


}
