package strategy;

public class SocialMediaContext {

    private ISocialMediaStrategy socialMediaStrategy;

    public void setSocialMediaStrategy(ISocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }

    public void connectTo(String friendName) {
        socialMediaStrategy.connectTo(friendName);
    }

}
