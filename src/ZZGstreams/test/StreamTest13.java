package ZZGstreams.test;

import ZZGstreams.domain.Category;
import ZZGstreams.domain.LightNovel;
import ZZGstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ZZGstreams.domain.Category.*;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List. of(
            new LightNovel("Tensei Shittara", 8.99, FANTASY),
            new LightNovel("Overlord", 3.99, FANTASY),
            new LightNovel("Violet Evergarden", 5.99, DRAMA),
            new LightNovel("No game no life", 2.99,  FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99,  FANTASY),
            new LightNovel("Kumo desuga", 1.99,  FANTASY),
            new LightNovel("Monogatari", 4,  ROMANCE)
    ));

    static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        StreamTest13::getPromotion
                ));
        System.out.println(collect);

        //Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(
                        StreamTest13::getPromotion
                )));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
