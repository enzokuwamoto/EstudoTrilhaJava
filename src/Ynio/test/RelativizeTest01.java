package Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    static void main(String[] args) {
        Path dir = Paths.get("home/enzo");
        Path clazz = Paths.get("home/enzo/devdojo/project/Test01.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/william");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/william/devdojo/project/Test01.java");
        Path relativize1 = Paths.get("temp");
        Path relativize2 = Paths.get("temp/temp.212121");
        System.out.println("1 - " + absolute1.relativize(absolute3));
        System.out.println("2 - " + absolute3.relativize(absolute1));
        System.out.println("3 - " + absolute1.relativize(absolute2));
        System.out.println("4 - " + relativize1.relativize(relativize2));
        System.out.println("5 - " + relativize2.relativize(relativize1 ));
    }
}
