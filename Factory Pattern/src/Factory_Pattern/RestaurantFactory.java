package src.Factory_Pattern;

public abstract class RestaurantFactory {

    public Burger_A orderBurger_A() {
        Burger_A burger = createBurger();
        burger.prepare();
        return burger;

    }

    public abstract Burger_A createBurger();
}
