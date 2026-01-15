package Pexception.exception.test;

import Pexception.exception.domain.Reader1;
import Pexception.exception.domain.Reader2;

import java.io.*;

public class TryWithResources {
//    static void main(String[] args) {
//        readFile();
//    }
    private static void readFile() throws IOException{ // -> add throws
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()){
        }
//        } catch (IOException e){ -> you can avoid
//
//        }
    }

    public static void readFile2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
