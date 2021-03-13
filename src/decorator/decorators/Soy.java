package decorator.decorators;

import decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.70 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with soy";
    }
}
