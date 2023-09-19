// interface Bike{
//     void turnOnEngine();
//     void accelerate();
// }

// class Motorcycle implements Bike{
//     boolean isEngineOn;
//     int speed;

//     public void turnOnEngine(){
//         isEngineOn= true;
//     }
//     public void accelerate(){
//         speed += 10;
//     }
// }

// class Bicycle implements Bike{
//     public void turnOnEngine(){
//         throw new AssertionError("there is no engine");
//     }
//     public void accelerate(){

//     }
// }


// // How to solve it
// interface Vehicle {
//     void accelerate();
// }

// class Motrcycle implements Vehicle {
//     boolean isEngineOn;
//     int speed;

//     public void turnOnEngine() {
//         isEngineOn = true;
//     }

//     public void accelerate() {
//         speed += 10;
//     }
// }

// class Bicycl implements Vehicle {
//     public void accelerate() {
//         // Implement acceleration logic for a bicycle here
//     }
// }



interface Bike {
    void accelerate();
}

class Motorcycle implements Bike {
    boolean isEngineOn;
    int speed;

    public void turnOnEngine() {
        isEngineOn = true;
    }

    public void accelerate() {
        speed += 10;
        System.out.println("Motorcycle is accelerating. Current speed: " + speed);
    }
}

class Bicycle implements Bike {
    int speed;

    public void accelerate() {
        speed += 5;
        System.out.println("Bicycle is accelerating. Current speed: " + speed);
    }
}

