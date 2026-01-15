package Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;


    static {
        System.out.println("Inside static init block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    {
        System.out.println("Inside init block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
