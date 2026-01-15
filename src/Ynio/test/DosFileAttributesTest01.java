package Ynio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/folder/text.txt");
        if(Files.notExists(path)) Files.createFile(path);
        Files.setAttribute(path, "dos:readonly", true);
        Files.setAttribute(path, "dos:hidden", true);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        
        System.out.print(dosFileAttributes.isReadOnly());
        System.out.print(dosFileAttributes.isHidden());
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(false);
        fileAttributeView.setReadOnly(false);

        System.out.println(fileAttributeView.readAttributes().isReadOnly());
        System.out.println(fileAttributeView.readAttributes().isHidden());


    }
}
