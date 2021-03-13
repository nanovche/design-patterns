package decorator.decorators;

/*
* Subclasses of it should implement getDescription
* */

import decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
