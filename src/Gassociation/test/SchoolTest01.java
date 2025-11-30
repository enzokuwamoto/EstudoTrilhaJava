package Gassociation.test;

import Gassociation.domain.Professor;
import Gassociation.domain.School;

public class SchoolTest01 {
    static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor, professor2};
        School school = new School("Konoha", professors);

        school.print();
    }
}
