package ObserverPExample.Observable;

import ObserverPExample.Observer.NotificationAlertObserver;
public interface StockObservable {
     public void add(NotificationAlertObserver ob);
     public void remove(NotificationAlertObserver ob);
     public void notifyObservers();

     public void setStockCount (int newStockAdded);

     public int getStockCount();
     
}
