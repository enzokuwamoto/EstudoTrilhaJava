package Dconstructor.test;


import Dconstructor.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Cobra Kai", "Fight Club", "Sony Pictures Television");

//        anime.init("Akudama Driver", "TV", 12, "Finished");
//        anime.setName("Akudama Driver");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        anime.print();
    }
}
