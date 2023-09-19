// class Vehicle{
// public:
//     virtual void turnOnEngine() = 0;
//     virtual void accelerate() = 0;
// };

// // Implement the Motorcycle class
// class Motorcycle : public Vehicle {
// private:
//     bool isEngineOn;
//     int speed;

// public:
//     Motorcycle() : isEngineOn(false), speed(0) {}

//     void turnOnEngine() override {
//         isEngineOn= true;
//     }

//     void accelerate() override {
//         speed += 10;
//     }

// };

// // Implement the Bicycle class
// class Bicycle : public Vehicle {
// public:
//     void turnOnEngine() override {
//         throw std::logic_error("There is no engine"); // breaks the behaviour
//     }

//     void accelerate() override {
//         // Implement acceleration logic for a bicycle if needed
//     }
// };


/*How to solve it *************************/

#include <iostream>

// Define the Bike interface
class Bike {
public:
    virtual void accelerate() = 0;
};

// Implement the Motorcycle class
class Motorcycle : public Bike {
private:
    bool isEngineOn;
    int speed;

public:
    Motorcycle() : isEngineOn(false), speed(0) {}

    void turnOnEngine() {
        isEngineOn = true;
    }

    void accelerate() override {
        speed += 10;
        std::cout << "Motorcycle is accelerating. Current speed: " << speed << std::endl;
    }
};

// Implement the Bicycle class
class Bicycle : public Bike {
private:
    int speed;

public:
    Bicycle() : speed(0) {}

    void accelerate() override {
        speed += 5;
        std::cout << "Bicycle is accelerating. Current speed: " << speed << std::endl;
    }
};

int main() {
    Motorcycle motorbike;
    Bicycle bicycle;

    // Accelerate the motorcycle
    motorbike.turnOnEngine();
    motorbike.accelerate();

    // Accelerate the bicycle
    bicycle.accelerate();

    return 0;
}
