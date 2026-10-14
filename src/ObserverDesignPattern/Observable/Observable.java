package ObserverDesignPattern.Observable;

import ObserverDesignPattern.ObserVer.Observer;

public interface Observable {
    public void add(Observer obj);
    public void delete(Observer obj);
    public void setData(int data);
    public void update();
}
