package ObserverDesignPattern.ObserVer;

public class EmailObserVer implements  Observer {
    String email;

    public EmailObserVer(String email){
        this.email=email;
    }
    public void update(String product){
        System.out.println("THis is email notification for product "+product+ this.email);
    }
}
