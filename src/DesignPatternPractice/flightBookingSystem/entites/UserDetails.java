package DesignPatternPractice.flightBookingSystem.entites;

public class UserDetails {
    public UserDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private  String name;
    private  String email;

}
