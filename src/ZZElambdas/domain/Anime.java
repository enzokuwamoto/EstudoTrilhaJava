package ZZElambdas.domain;

public class Anime {
    private String title;
    private int episode;

    public Anime(String title, int episode) {
        this.title = title;
        this.episode = episode;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episode=" + episode +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisode() {
        return episode;
    }
}
