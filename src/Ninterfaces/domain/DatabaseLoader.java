package Ninterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Load data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking database permission");
    }


    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the DatabaseLoader");
    }
}
