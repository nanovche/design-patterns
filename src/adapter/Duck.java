package adapter;

public interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quacks like Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("Flies like Mallard duck");
    }
}



