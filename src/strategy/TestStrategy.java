package strategy;

public class TestStrategy {

    public static void main(String[] args) {

        // Creating social Media Connect Object for connecting with friend by
        // any social media designPatterns.strategy.
        SocialMediaContext context = new SocialMediaContext();

        // Setting Facebook designPatterns.strategy.
        context.setSocialMediaStrategy(new FacebookStrategy());
        context.connectTo("Lokesh");

        System.out.println("====================");
        // Setting Orkut designPatterns.strategy.
        context.setSocialMediaStrategy(new InstagramStrategy());
        context.connectTo("Lokesh");
    }

}
