package adapter;

public class TestAdapter {

    public static void main(String[] args) {

        //can pass it since it is a duck
        MallardDuck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        //cannot coz it is not a duck
        WildTurkey turkey = new WildTurkey();
        testTurkey(turkey);

        //but we can adapt it(wrap it) and pass it like that:
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);

        DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);
        testTurkey(duckAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
        System.out.println();
    }

}



