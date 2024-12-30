package pizzafactory;

public class PizzaFactory {

    public static Pizza makePizza(PizzaType pizzaType) throws NoSuchPizzaException {

        Pizza pizza;

        switch (pizzaType) {
            case PEPERONNI -> pizza = new PeperoniPizza();
            case VEGETARIAN -> pizza = new VegetarianPizza();
            default -> throw new NoSuchPizzaException();
        }

        return pizza;
    }

}
