package ObserverPExample.Observer;
import ObserverPExample.Observable.StockObservable;
public class MobileAlertObserverimpl implements NotificationAlertObserver {
    String  userName;
    StockObservable ob;

    public MobileAlertObserverimpl(String emailId, StockObservable ob){
        this.ob = ob;
        this.userName= emailId;
    }

    @Override
    public void update(){
       sendMsgOnMobile(userName,"product is instock hurry up!");
    }
    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to:" + userName);
    }
}
