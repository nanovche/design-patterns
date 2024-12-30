package baeldungobserver;

public class Observer implements ObserverI {
    private String news;
    @Override
    public void update(Object o) {
        this.setNews((String) o);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
