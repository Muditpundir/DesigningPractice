package MediatorDesignPattern.BaseComponent;

import MediatorDesignPattern.Mediator.FlightMediator;

public class CommercialFlight extends  Flight{

   public CommercialFlight(FlightMediator mediator,String flightNumber){
        super(mediator,flightNumber);
    }

    @Override
    public void send() {
        System.out.println("Sending message from flight "+ this.flightNumber);;
        mediator.sendMessage(this);

    }

    @Override
    public void recieve() {
          System.out.println("Message received for flight "+this.flightNumber);
    }
}
