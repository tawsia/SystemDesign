#include <iostream>

// Define keyboard and mouse interfaces
class Keyboard {
public:
    virtual void type() = 0;
};

class Mouse {
public:
    virtual void click() = 0;
};

// Implement wired keyboard and mouse
class WiredKeyboard : public Keyboard {
public:
    void type() override {
        std::cout << "Typing on a wired keyboard." << std::endl;
    }
};

class WiredMouse : public Mouse {
public:
    void click() override {
        std::cout << "Clicking with a wired mouse." << std::endl;
    }
};

// Implement MacBook class
class MacBook {
private:
    Keyboard* keyboard;
    Mouse* mouse;

public:
    MacBook(Keyboard* keyboard, Mouse* mouse) : keyboard(keyboard), mouse(mouse) {}

    void useKeyboardAndMouse() {
        keyboard->type();
        mouse->click();
    }
};

int main() {
    Keyboard* wiredKeyboard = new WiredKeyboard();
    Mouse* wiredMouse = new WiredMouse();

    MacBook myMacBook(wiredKeyboard, wiredMouse);
    myMacBook.useKeyboardAndMouse();

    // Don't forget to deallocate memory for dynamic objects
    delete wiredKeyboard;
    delete wiredMouse;

    return 0;
}
