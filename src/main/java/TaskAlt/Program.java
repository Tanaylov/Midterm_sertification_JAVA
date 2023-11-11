package TaskAlt;

public class Program {
    public static void main(String[] args) {
        Prize prize1 = new Prize("Plane", 12, 0);
//        Prize prize2 = new Prize("Robot", 3);
//        Prize prize3 = new Prize("Robot", 13, 2);
        Prize.putPrize(prize1);
//        Prize.putPrize(prize2);
//        Prize.putPrize(prize3);
        Prize.generatePrizes(9);
        System.out.println("Prizes = " + Prize.getPrizes());
        while (!Prize.getPrizes().isEmpty()) {
            System.out.println(Prize.getPrize());
        }


    }
}
