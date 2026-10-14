package BuilderPattern;

public class Car {
    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    Car(CarBuilder builder){
        this.tyre=builder.tyre;
        this.brake=builder.brake;
        this.engine=builder.engine;
        this.hasSunroof=builder.hasSunroof;
        this.seats=builder.seats;
    }
    public int tyre;
    public String engine;
    public String brake;
    public String seats;
    public boolean hasSunroof;

    public static class CarBuilder{
        public int tyre=4;
        public String engine;
        public String brake;
        public String seats="Leather";
        public boolean hasSunroof=false;

        public  CarBuilder setTyre(int cnt){
            this.tyre=cnt;
            return this;
        }
        public  CarBuilder setEngine(String cnt){
            this.engine=cnt;
            return this;
        }
        public  CarBuilder setSeats(String cnt){
            this.seats=cnt;
            return this;
        }
        public  CarBuilder setBrake(String cnt){
            this.brake=cnt;
            return this;
        }
        public  CarBuilder setSunroof(Boolean cnt){
            this.hasSunroof=cnt;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

}
