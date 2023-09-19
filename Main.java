public class Main {
    public static void main(String[] args) {
        Motorcycle motorbike = new Motorcycle();
        Bicycle bicycle = new Bicycle();

        // Accelerate the motorcycle
        motorbike.turnOnEngine();
        motorbike.accelerate();

        // Accelerate the bicycle
        bicycle.accelerate();
    }
}