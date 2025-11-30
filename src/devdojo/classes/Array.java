package devdojo.classes;

public class Array {
    static void main(String[] args) {
        int ages[] = new int[]{1, 7, 10, 2, 5}  ;
        for (int i = 0; i < ages.length; i++) {
            if (i == ages.length-1){
                System.out.print(ages[i]+"\n");
            } else {
                System.out.print(ages[i]+", ");
            }
        }
        // for each - over all elements
        for (int num:ages){
            System.out.println(num);
        }
    }
}
