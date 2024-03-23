package src;

public class Restaurant {
    public Burger orderBurger(String burgerString) {

        Burger createBurger = null;
        if ("VEGGIE".equals(burgerString)) {
            createBurger = new VeggieBurger();
        } else if ("BEEF".equals(burgerString)) {
            createBurger = new BeefBurger();
        }
        return createBurger;

    }
}
