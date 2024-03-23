import src.Burger;
import src.Restaurant;

public class Main {


    // order alabliyorum
    // burger create edebiliyorum
    // öncelikle olması gereken varoş kodu yazalım
    public static void Xmain(String[] args) {

        Restaurant order = new Restaurant();
        Burger burgerVeggie = order.orderBurger("VEGGIE");
        burgerVeggie.prepareBurger();

        Burger burgerBeef = order.orderBurger("BEEF");
        burgerBeef.prepareBurger();

    }

}