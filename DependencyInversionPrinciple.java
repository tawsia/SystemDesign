// interface Keyboard {
//     // Define methods related to a keyboard here
// }

// interface Mouse {
//     // Define methods related to a mouse here
// }

// class WiredKeyboard implements Keyboard {
//     // Implement the methods for a wired keyboard
// }

// class WiredMouse implements Mouse {
//     // Implement the methods for a wired mouse
// }

// // class Macbook{
// //     private final WiredKeyboard keyboard;
// //     private final WiredMouse mouse;

// //     public MacBook(){
// //         keyboard = new WiredKeyboard();
// //         mouse = new WiredMouse();
// //     }
// // }

// // Here we are dependent on concrete classes rather than interfaces

// // We can solve this like 

// class MacBook{
//     private final Keyboard keyboard;
//     private final Mouse mouse;

//     public MacBook(Keyboard keyboard, Mouse mouse){
//         this.keyboard = keyboard;
//         this.mouse = mouse;
//     }
// }

// // Here Keyboard and Mouse are interfaces


interface Keyboard {
    void type();
}

interface Mouse {
    void click();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing on a wired keyboard.");
    }
}

class WiredMouse implements Mouse {
    public void click() {
        System.out.println("Clicking with a wired mouse.");
    }
}

class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void useKeyboardAndMouse() {
        keyboard.type();
        mouse.click();
    }

    public static void main(String[] args) {
        Keyboard wiredKeyboard = new WiredKeyboard();
        Mouse wiredMouse = new WiredMouse();

        MacBook myMacBook = new MacBook(wiredKeyboard, wiredMouse);
        myMacBook.useKeyboardAndMouse();
    }
}
