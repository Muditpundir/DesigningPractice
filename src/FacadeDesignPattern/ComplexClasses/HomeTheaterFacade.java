package FacadeDesignPattern.ComplexClasses;

public class HomeTheaterFacade {
    public DimLight light;
    public Sound sound;
    public StreamNetflix netflix;


    public HomeTheaterFacade(DimLight light,Sound sound,StreamNetflix streamNetflix){
        this.light=light;
        this.sound=sound;
        this.netflix=streamNetflix;
    }

    public void watchMovie(){
        System.out.println("Welcome to Home theater");
        light.OnLight();
        sound.turnOnRoomTheater();
        netflix.openNetflix();
        light.setDimLight(10);
        sound.setVolume(100);
        netflix.playMovie("Stragersthings");

    }
}
