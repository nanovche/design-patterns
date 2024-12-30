package baeldungobserver;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private String news;
    private List<ObserverI> channels = new ArrayList<>();

    public void addObserver(ObserverI observer){
        this.channels.add(observer);
    }
    public void removeObserver(ObserverI observer) {
        this.channels.remove(observer);
    }
    public void setNews(String news) {
        this.news = news;
        for (ObserverI channel: channels) {
            channel.update(this.news);
        }
    }

}
