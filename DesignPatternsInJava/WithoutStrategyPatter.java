package DesignPatternsInJava;

class Vehicle {
    public void drive() {
        System.out.println("Normal Drive capability");
    }
}

class GoodVehicle extends Vehicle {

}

class OffroadVehicle extends Vehicle {
    public void offroadMode() {
        System.out.println("Special Drive Capability.");
    }
}

class PassengerVehicle extends Vehicle {

}

class SportsVehicle extends Vehicle {
    public void race() {
        System.out.println("Special drive capability");
    }
}

