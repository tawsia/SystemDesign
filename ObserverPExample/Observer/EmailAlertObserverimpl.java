package ObserverPExample.Observer;

import ObserverPExample.Observable.StockObservable;

public class EmailAlertObserverimpl implements NotificationAlertObserver {
    String emailId;
    StockObservable ob;

    // Constructor Injection
    public EmailAlertObserverimpl(String emailId, StockObservable ob){
        this.ob = ob;
        this.emailId= emailId;
    }

    @Override
    public void update(){
        sendMail(emailId, "product is in stock hurry up !");
    }

    private void sendMail(String emailId, String msg){
      System.out.println("Mail sent to:" + emailId); //send the actual email to the end user
    }

}
