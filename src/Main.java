public class Main {

    public static void main(String[] args) {
        int balance = 200;
        int replenishment = 500;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            balance = balance + bonus;
        }

        System.out.println("Ваш бонус " + bonus);
        System.out.println("Ваш баланс " + balance);

    }
}