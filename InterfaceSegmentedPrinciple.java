interface RestaurantInterface{
    void WashDishes();
    void cookFood();
    void takeOrder();
}

// class waiter implements RestaurantInterface{
//     public void WashDishes(){
//         // not my job;
//     }
//     public void cookFood(){
//         // not my job;
//     }
//     public void takeOrder(){
//         System.out.println("Taking Orders");
//     }
// }

// This means interface should be such that client should not 
// implement unnecceary functions
// Rather we can implement it like this:
// We can make small segments 
interface WaiterInterface{
    void takeOrder();
}

interface chefInterface{
    void cookFood();
}

interface dishWasherInterface{
    void WashDishes();
}

class waiter implements WaiterInterface{
    public void takeOrder(){
        System.out.println("Taking Orders");
    }
}