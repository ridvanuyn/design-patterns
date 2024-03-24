package src.Factory_Pattern;

public class Main_A {

    public static void Ymain(String[] args) {
        RestaurantFactory veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        veggieBurgerRestaurant.orderBurger_A();

        RestaurantFactory beefFactory = new BeefBurgerRestaurant();
        beefFactory.orderBurger_A();

    }

}
