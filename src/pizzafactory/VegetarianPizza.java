package pizzafactory;

public class VegetarianPizza extends Pizza {

    public VegetarianPizza(){
        super(PizzaType.VEGETARIAN);
    }
    @Override
    protected void makeSpecialPizza() {
        System.out.println("vegetarianpizza");
    }
}
