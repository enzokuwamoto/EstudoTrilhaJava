package Opolymorphism.service;

import Opolymorphism.repository.Repository;

public class DatabaseRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the database");
    }
}
