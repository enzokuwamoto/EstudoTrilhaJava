package Ninterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Load data from file");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checking file permission");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the FileLoader");
    }
}
