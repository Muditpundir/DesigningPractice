package ObserverDesignPattern.Observable;

import ObserverDesignPattern.ObserVer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements  Observable {
   public  List<Observer> lst=new ArrayList<Observer>();
    int stockcount;
    @Override
    public void add(Observer obj){
        lst.add(obj);
    }


    @Override
    public void delete(Observer obj) {
      lst.remove(obj);
    }

    @Override
    public void setData(int data) {
      if(stockcount==0){
          update();
      }
      this.stockcount+=data;
    }

    @Override
    public void update() {
        for(Observer obj:lst)
          obj.update("Iphone");
    }
}
