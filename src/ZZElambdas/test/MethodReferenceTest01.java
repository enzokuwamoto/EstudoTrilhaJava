package ZZElambdas.test;

import ZZElambdas.domain.Anime;
import ZZElambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("Anime", 400), new Anime("One Piece", 900)));
        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);
    }
}
