package DesignPatternsInJava;

public class Main {
    public static void main(String[] args) {
        // Create an observable object
        WsObservable weatherStation = new WsObservable();

        // Create observer objects (MobileDisplay and TvDisplay)
        DisplayObserver mobileDisplay = new MobileDisplay(weatherStation);
        DisplayObserver tvDisplay = new TvDisplay();

        // Add observers to the observable object
        weatherStation.add(mobileDisplay);
        weatherStation.add(tvDisplay);

        // Simulate a change in temperature
        int newTemp = 25;
        weatherStation.setTemp(newTemp);

        // Remove the MobileDisplay observer
        weatherStation.remove(mobileDisplay);

        // Simulate another change in temperature
        newTemp = 30;
        weatherStation.setTemp(newTemp);
    }
}
