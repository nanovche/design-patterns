package builder.pizzabuilder;

import static builder.pizzabuilder.NyPizza.Size.SMALL;
import static builder.pizzabuilder.Pizza.Topping.*;

public class PizzaTest {

    public static void main(String[] args) {


        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }
}
