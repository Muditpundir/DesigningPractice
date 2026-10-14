package DesignPatternPractice.ExpdediaBookingSystem.user;

import java.security.PublicKey;

public class UserDetails {
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private   String name;
    private   String email;

    public UserDetails(String name,String email){
        this.name=name;
        this.email=email;
    }
}
