package devdojo.classes;

import java.util.Scanner;

public class Matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;
        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

//        for (int i = 0; i < days.length; i++) {
//            for (int j = 0; j < days[i].length; j++) {
//                System.out.println(days[i][j]);
////            }
//        }

        // for each
//        for (int[] baseArray : days) {
//            for (int day: baseArray){
//                System.out.println(day);
//            }
//        }
        int[][] preencher = new int[3][3];
        int [][] array = {{1, 2, 3, 4}, {1,2,3}};
        // preenchimento do array
//        for (int i = 0; i < preencher.length; i++) {
//            for (int j = 0; j < preencher[i].length; j++) {
//                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
//                preencher[i][j] = sc.nextInt();
//            }
//        }
        // print do array
//        for (int i = 0; i < preencher.length; i++) {
//            for (int j = 0; j < preencher[i].length; j++) {
//                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "] = "+preencher[i][j]+"\n");
//            }
//        }
        //formas de inicializar
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array teste de inicialização = "+array[i][j]);
            }
            
        }
    }
}

