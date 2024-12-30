package pizzafactory;

public class PeperoniPizza extends Pizza {

    public PeperoniPizza(){
        super(PizzaType.PEPERONNI);
    }
    @Override
    protected void makeSpecialPizza() {
        System.out.println("peperonipizza");
    }
}
