package Ninterfaces.test;

import Ninterfaces.domain.DatabaseLoader;
import Ninterfaces.domain.FileLoader;

import java.io.File;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader dataBaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        dataBaseLoader.retrieveMaxDataSize();
        fileLoader.retrieveMaxDataSize();
    }
}
