package DesignPatternsInJava;
import java.util.ArrayList;
import java.util.List;

interface DisplayObserver {
    void update();
}

class MobileDisplay implements DisplayObserver {
    WsObservable obj;

    // Constructor Injection
    public MobileDisplay(WsObservable ob) {
        this.obj = ob;
    }

    @Override
    public void update() {
        System.out.println("Mobile Display Updated Successfully");
    }
}

class TvDisplay implements DisplayObserver {
    @Override
    public void update() {
        System.out.println("TV Display Updated Successfully");
    }
}

interface Observable {
    void add(DisplayObserver obj);
    void remove(DisplayObserver obj);
    void notifyObservers();
    int setTemp(int newTemp);
}

class WsObservable implements Observable {
    List<DisplayObserver> displayList = new ArrayList<>();
    int temp;

    @Override
    public void add(DisplayObserver obj) {
        displayList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        displayList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver obj : displayList) {
            obj.update();
        }
    }

    @Override
    public int setTemp(int newTemp) {
        temp = newTemp;
        notifyObservers();
        return temp;
    }
}
