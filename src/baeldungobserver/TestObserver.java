package baeldungobserver;

public class TestObserver {

    public static void main(String[] args) {

        ObserverI observer1 =  new Observer();
        ObserverI observer2 =  new Observer();
        ObserverI observer3 =  new Observer();

        baeldungobserver.Observable observable = new Observable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setNews("news");

        System.out.println(((Observer)observer1).getNews());
        System.out.println(((Observer)observer2).getNews());
        System.out.println(((Observer)observer3).getNews());

        }

}
