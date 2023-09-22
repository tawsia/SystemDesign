package PizzaDecoratorExample;


public class Demo {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new Magherita());
        System.out.println("Cost of Magarita pizza with extra cheese will be: " + pizza1.cost());

        BasePizza pizza2 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("Cost of VegDelight pizza with extra cheese and Mushroom will be: " + pizza2.cost());

        BasePizza pizza3 = new Mushroom(new Farmhouse());
        System.out.println("Cost of Farmhouse pizza with extra Mushroom will be: " + pizza3.cost());
    }
}
