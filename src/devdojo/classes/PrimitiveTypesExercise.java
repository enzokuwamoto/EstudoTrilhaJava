package devdojo.classes.introduction;

public class PrimitiveTypesExercise {
    static void main(String[] args) {
        String name = "Enzo";
        String address = "Mogi das Cruzes";
        double salary = 5780.;
        // dd/MM/YYYY
        String date = "12/11/2025";
        String report = "I'm "+ name+", living at "+address+", confirm that I received the salary of $"+salary+" on "+date;
        System.out.println(report);
    }
}
