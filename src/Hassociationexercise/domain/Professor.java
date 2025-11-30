package Hassociationexercise.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.researchField);
        if (seminars == null && seminars.length == 0){
            System.out.println("Ainda sem seminários cadastrados.");
            return;
        }
        for (Seminar seminar : seminars) {
            System.out.println("*********************");
            System.out.println("Seminar title - " + seminar.getTitle());
            System.out.println("Seminar address - " + seminar.getPlace().getAddress());//o que faz essa linha?
            System.out.println("*********************");
            if (seminar.getStudents() == null && seminars.length == 0) return;
            for (Student student : seminar.getStudents()) {
                System.out.println("----- Classe -----");
                System.out.println("Student name - " + student.getName() + " | Age - " + student.getAge());
            }

        }

    }

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }
}
