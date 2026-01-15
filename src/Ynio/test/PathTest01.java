package Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\enzoyano\\OneDrive - Suzano S A\\Documentos\\Java\\EstudoTrilhaJava\\src\\file_renamed.txt");
        Path p2 = Paths.get("C:","Users", "enzoyano", "OneDrive - Suzano S A", "Documentos", "Java", "EstudoTrilhaJava","src","file_renamed.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
    }
}
