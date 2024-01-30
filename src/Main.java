public class Main {
    public static void main(String[] args) {
        int check = 100;
        int refill = 1200;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(check + refill + bonus);
    }
}