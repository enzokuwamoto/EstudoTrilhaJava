package ZZGstreams.test;

import ZZGstreams.domain.Category;
import ZZGstreams.domain.LightNovel;
import ZZGstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static ZZGstreams.domain.Category.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

public class StreamTest15 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, FANTASY),
            new LightNovel("Overlord", 3.99, FANTASY),
            new LightNovel("Violet Evergarden", 5.99, DRAMA),
            new LightNovel("No game no life", 2.99, FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Monogatari", 4, ROMANCE)
    ));

    static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
