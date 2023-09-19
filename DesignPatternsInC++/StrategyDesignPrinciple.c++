// Without Strategy Pattern

#include <iostream>
#include <string>

class Vehicle {
public:
    void drive() {
       cout << "Normal Drive capability" << std::endl;
    }
};

class GoodVehicle : public Vehicle {

public:
};

class OffroadVehicle : public Vehicle {
public:
    void offroadMode() {
        cout << "Special Drive Capability." << std::endl;
    }
};

class PassengerVehicle : public Vehicle {

public:
};

class SportsVehicle : public Vehicle {
public:

    void race() {
        cout << "Special drive capability" << std::endl;
    }
};

int main() {
    // You can create instances of the classes and use their methods in the main function if needed.
    return 0;
}


