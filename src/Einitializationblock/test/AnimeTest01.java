package Einitializationblock.test;

import Einitializationblock.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode+" ");
        }

    }
}
