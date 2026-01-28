package ZZFoptional.test;

import ZZFoptional.domain.Manga;
import ZZFoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main(String[] args) {
        Optional<Manga> mangaByIdFunctional = MangaRepository.findByTitleFunction("Boku no Hero");
        mangaByIdFunctional.ifPresent(m -> m.setTitle("Boku no Hero 5"));
        System.out.println(mangaByIdFunctional);

        // Tentar localizar, caso não encontrado lançar exception
        Manga mangaById = MangaRepository.findByIdFunctional(1)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        // Tentar localizar, caso não encontrado criar um objeto
        MangaRepository.findByTitleFunction("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

    }
}
