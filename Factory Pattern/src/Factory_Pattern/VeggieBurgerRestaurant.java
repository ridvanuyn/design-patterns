package src.Factory_Pattern;

public class VeggieBurgerRestaurant extends RestaurantFactory {

    @Override
    public Burger_A createBurger() {
        return new VeggieBurger_A();
    }

}
