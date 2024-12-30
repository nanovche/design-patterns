package pizzafactory;

public abstract class Pizza {

    PizzaType pizzaType;

    public Pizza(PizzaType pizzaType){
        this.pizzaType = pizzaType;
        preparePizza();
    }

    private void bake(){
        System.out.println("bake");
    }
    private void cut(){
        System.out.println("cut");
    }
    private void box(){
        System.out.println("box");
    }

    private void preparePizza(){
        makeSpecialPizza();
        bake();
        cut();
        box();
    }
    protected abstract void makeSpecialPizza();

}
