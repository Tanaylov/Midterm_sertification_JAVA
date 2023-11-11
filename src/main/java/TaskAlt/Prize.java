package TaskAlt;

import java.util.PriorityQueue;
import java.util.Random;

public class Prize implements Comparable<Prize> {
    private String name;
    private int id;
    private int dropoutRate;
    private static String[] prizeName = {"Robot", "Lego", "Doll", "Car", "Gun"};
    private  static PriorityQueue<Prize> prizes = new PriorityQueue<>();
    public static void putPrize(Prize prize) { prizes.add(prize); }
    public static Prize getPrize() {
        if (prizes.peek().dropoutRate == 0) {
            prizes.remove();
            System.out.println("Plane is too expensive.");
            return new Prize("Candy", 0);
        }
        return prizes.poll();
    }
    public static PriorityQueue<Prize> getPrizes() { return prizes; }
    public static void generatePrizes(int countPrizes) {
        Random random = new Random();
        for (int i = 0; i < countPrizes; i++) {
            String name = prizeName[random.nextInt(prizeName.length)];
            switch (name) {
                case "Robot":
                    prizes.add(new Prize(name, 1));
                    break;
                case "Lego":
                    prizes.add(new Prize(name, 2));
                    break;
                case "Doll":
                    prizes.add(new Prize(name, 5));
                    break;
                case "Car":
                    prizes.add(new Prize(name, 3));
                    break;
                case "Gun":
                    prizes.add(new Prize(name, 4));
                    break;
            }
        }
    }
    Prize(String name, int id, int dropoutRate) {
        this.name = name;
        this.id = id;
        this.dropoutRate = dropoutRate;
    }
    Prize(String name, int dropoutRate) {
        this(name, (new Random()).nextInt(100, 200),  dropoutRate);
    }

    @Override
    public int compareTo(Prize o) {
        if (o.dropoutRate > this.dropoutRate) return 1;
        if (o.dropoutRate == this.dropoutRate) return o.name.compareTo(this.name);
        return -1;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", id, name);
    }
}
