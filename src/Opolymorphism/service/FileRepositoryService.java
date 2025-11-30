package Opolymorphism.service;

import Opolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the file");
    }
}
