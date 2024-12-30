package strategy;

public class FacebookStrategy implements ISocialMediaStrategy{

    @Override
    public void connectTo(String friendName) {
        System.out.println("Connect via facebook designPatterns.strategy: " + friendName);
    }
}
