package src.Factory_Pattern;

public class VeggieBurger_A implements Burger_A{

    @Override
    public void prepare() {
        System.out.println("Abstract Veggie created");
    }
    
}
