package ObserverPExample;

import ObserverPExample.Observable.IphoneObservableImpl;
import ObserverPExample.Observable.StockObservable;
import ObserverPExample.Observer.EmailAlertObserverimpl;
import ObserverPExample.Observer.MobileAlertObserverimpl;
import ObserverPExample.Observer.NotificationAlertObserver;

public class store {
    public static void main(String args[]){
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver ob1 = new EmailAlertObserverimpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver ob2 = new EmailAlertObserverimpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver ob3 = new MobileAlertObserverimpl("xyz_username", iphoneStockObservable);
     
        iphoneStockObservable.add(ob1);
        iphoneStockObservable.add(ob2);
        iphoneStockObservable.add(ob3);


        iphoneStockObservable.setStockCount(10);


    }
}
