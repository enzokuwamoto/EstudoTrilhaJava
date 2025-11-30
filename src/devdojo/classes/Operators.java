package devdojo.classes.introduction;

public class Operators {
    static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 30;
        double res = number01 / (double) number02;
        System.out.println(res);
        // %
        float module1 = number01 % number02;
        float module2 = number02 % number01;
        System.out.println("module1 = " + module1);
        System.out.println("module2 = " + module2);
        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        System.out.println("isTenLowerThanTwenty = " + isTenLowerThanTwenty);

        // && (AND) || OR !
        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age > 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty -> " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty -> " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingAccount > playstationFivePrice;
        System.out.println("canBeBought: " + canBeBought);

        // = += -= *= /= %=
        double bonus = 1880;
        bonus = 2000;

        int count = 0;
        count++;
        System.out.println(count);


    }
}
