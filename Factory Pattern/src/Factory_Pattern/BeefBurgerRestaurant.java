package src.Factory_Pattern;

public class BeefBurgerRestaurant extends RestaurantFactory {

    @Override
    public Burger_A createBurger() {
        return new BeefBurger_A();
    }

}
