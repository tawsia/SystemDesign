package ObserverPExample.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPExample.Observer.NotificationAlertObserver;
public class IphoneObservableImpl implements StockObservable{
    
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver ob) {observerList.add(ob);}
    @Override
    public void remove(NotificationAlertObserver ob) {observerList.add(ob);}
    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver ob: observerList ){
            ob.update();
        }
    }

    public void setStockCount(int newStockAdded){
        if(stockCount==0){
            notifyObservers();
        }

        stockCount = stockCount + newStockAdded;

    }

    public int getStockCount() {return stockCount;}

}