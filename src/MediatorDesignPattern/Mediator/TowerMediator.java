package MediatorDesignPattern.Mediator;

import MediatorDesignPattern.BaseComponent.Flight;

import java.util.ArrayList;
import java.util.List;

public class TowerMediator implements  FlightMediator{
    private final List<Flight> flightList=new ArrayList<>();

    public void register(Flight flight){
        flightList.add(flight);
    }
    public void sendMessage(Flight sender){
        for(Flight flight:flightList){
            if(flight!=sender)flight.recieve();

        }
    }
}
