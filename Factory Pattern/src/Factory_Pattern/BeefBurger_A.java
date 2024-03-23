package src.Factory_Pattern;

public class BeefBurger_A implements Burger_A{

    @Override
    public void prepare() {
        System.out.println("Abstract Beef created");
    }
    
}
