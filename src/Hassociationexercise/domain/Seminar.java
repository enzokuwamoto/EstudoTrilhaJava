package Hassociationexercise.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public void print(){
        System.out.println(this.title);
        if (students == null & students.length == 0){
            System.out.println("Ainda sem alunos cadastrados.");
            return;
        }
        for (Student student : students) {
            System.out.println("Name "+student.getName());
            System.out.println("Age "+student.getAge());
        }

        System.out.println(this.place);
    }

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }
// adicionando um seminario para o estudante
    public Seminar(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
        // vinculo bidirecional
        if (this.students != null){
            for (Student student : students) {
                student.setSeminar(this); // here is the key
            }

        }
    }


    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
