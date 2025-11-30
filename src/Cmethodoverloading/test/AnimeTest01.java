package Cmethodoverloading.test;

import Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Driver", "TV", 12, "Finished");
//        anime.setName("Akudama Driver");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        anime.print();
    }
}
