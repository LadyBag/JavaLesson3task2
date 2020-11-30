public class Main {
    public static void main (String[] args ) {
        int balance = 100;
        int summa = 1500;
        int bonus = 0;

        if (summa > 1000) {
            bonus = summa / 100;

        }

        int itog = balance + bonus + summa;
        System.out.println(itog);
    }

}
