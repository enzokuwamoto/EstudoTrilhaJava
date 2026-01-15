package Wvio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class BufferedWritterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);// Auto Closeable
            BufferedWriter bw = new BufferedWriter(fw, 2048)){
            bw.write("Fala meu fi    \n");
            bw.newLine();
            bw.flush(); // Forçar registro de tudo que está no buffer
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
