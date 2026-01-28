package ZZElambdas.test;

import ZZElambdas.domain.Anime;
import ZZElambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    static void main(String[] args) {
//        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("Anime", 400), new Anime("One Piece", 900)));
        animes.sort(animeComparators::compareByEpisodeNonStatic);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animes);
        System.out.println(animeBiFunction.apply("OiaSó", 149));
    }

}
