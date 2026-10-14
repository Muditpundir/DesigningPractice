package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements  SmartComponent{

    public List<SmartComponent> componentList=new ArrayList<>();

    public void addComponent(SmartComponent component){
        componentList.add(component);
    }

    public void removeComponent(SmartComponent component){
        componentList.remove(component);
    }

    @Override
    public void turnOn() {

        for(SmartComponent component:componentList){
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for(SmartComponent component:componentList){
            component.turnOff();
        }
    }
}
