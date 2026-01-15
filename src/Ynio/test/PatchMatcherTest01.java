package Ynio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PatchMatcherTest01 {
    static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("folder/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/*.{bkp,java,txt}");
    }
    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
