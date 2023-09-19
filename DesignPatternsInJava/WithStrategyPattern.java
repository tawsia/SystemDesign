package DesignPatternsInJava;
interface DriveStrategy {
    void drive();
}

class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}

class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Fast drive");
    }
}

class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}

class Sports extends Vehicle {
    public Sports() {
        super(new SpecialDrive());
    }
}

class Offroad extends Vehicle {
    public Offroad() {
        super(new SpecialDrive());
    }
}

class Passenger extends Vehicle {
    public Passenger() {
        super(new NormalDrive());
    }
}

