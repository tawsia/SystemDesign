#include <iostream>

// Define the individual interfaces
class WaiterInterface {
public:
    virtual void takeOrder() = 0;
};

class ChefInterface {
public:
    virtual void cookFood() = 0;
};

class DishWasherInterface {
public:
    virtual void washDishes() = 0;
};

// Implement the interfaces in concrete classes
class Waiter : public WaiterInterface {
public:
    void takeOrder() override {
        std::cout << "Taking Orders" << std::endl;
    }
};

class Chef : public ChefInterface {
public:
    void cookFood() override {
        // Implementation for cooking food
    }
};

class DishWasher : public DishWasherInterface {
public:
    void washDishes() override {
        // Implementation for washing dishes
    }
};

int main() {
    // Example usage
    Waiter waiter;
    waiter.takeOrder();

    Chef chef;
    chef.cookFood();

    DishWasher dishwasher;
    dishwasher.washDishes();

    return 0;
}
