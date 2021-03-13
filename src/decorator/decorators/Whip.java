package decorator.decorators;

import decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped";
    }
}
