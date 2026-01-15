package Wvio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("oi.txt");
        try (FileWriter fw = new FileWriter(file, true )){ // Auto Closeable
            fw.write("Te amo Manuella, fedôzinho! s2 \n");
            fw.flush(); // Forçar registro de tudo que está no buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
