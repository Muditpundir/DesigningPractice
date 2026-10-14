package MediatorDesignPattern.BaseComponent;

import MediatorDesignPattern.Mediator.FlightMediator;

 public abstract  class Flight {
    protected final FlightMediator mediator;
    public  String flightNumber;

    Flight(FlightMediator flg,String flightNumber){
        this.mediator=flg;
        this.flightNumber=flightNumber;
    }

    public abstract void send();
    public abstract void recieve();
}
