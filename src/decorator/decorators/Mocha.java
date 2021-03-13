package decorator.decorators;

import decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    //passing the thing we're wrapping to the decorator's constructor
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    //delegate the call to the object we're decorating, the add the cost of the condiment(decorator)
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    //same for description


}
