package MediatorDesignPattern.Mediator;

import MediatorDesignPattern.BaseComponent.Flight;

public interface FlightMediator {
//    void registerFlight(Flight flight);
//    void sendMessage(String message, Flight sender);
      public void register(Flight flight);
      public void sendMessage(Flight sender);
}
