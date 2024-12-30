package strategy;

public class InstagramStrategy implements ISocialMediaStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connect via instagram" + friendName);
    }

}
