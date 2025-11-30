package Wvio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("oi.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Is created " + isCreated);

            boolean exists = file.exists();
            System.out.println("Exists " + exists);
            System.out.println("Path " + file.getPath());
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("Is file " + file.isFile());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is hidden " + file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if (exists){
                boolean isDeleted = file.delete();
                System.out.println("Is deleted " + isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
