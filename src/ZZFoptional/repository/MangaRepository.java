package ZZFoptional.repository;

import ZZFoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku No Hero", 50), new Manga(2, "Overlord", 25));

    // not functional programming

    private static Optional<Manga> findByTitle(String title) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (manga.getTitle().equals(title)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    private static Optional<Manga> findById(Integer id) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (manga.getId().equals(id)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    // with functional programming
    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByIdFunctional(Integer id){
            return findBy(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> findByTitleFunction(String title){
        return findBy(manga -> manga.getTitle().equals(title));
    }
}

