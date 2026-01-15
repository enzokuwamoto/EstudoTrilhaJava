package Opolymorphism.test;

import Opolymorphism.repository.Repository;
import Opolymorphism.service.DatabaseRepositoryService;
import Opolymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    static void main(String[] args) {
        Repository repository = new InMemoryRepositoryService();
        repository.save();
    }
}
