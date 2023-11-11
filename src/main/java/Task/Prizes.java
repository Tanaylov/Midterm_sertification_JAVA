package Task;

import Task.Product.Product;
import Task.Product.Toy.Car;
import Task.Product.Toy.Doll;
import Task.Product.Toy.Lego;
import Task.Product.Toy.Robot;

import java.util.PriorityQueue;
import java.util.Random;

public class Prizes {
    private Product product;
    protected int id;
    protected static int idCounter;
    protected int oddsOfWinning;
    private PriorityQueue<Product> prizes;
    Random random = new Random();
    {
        ++idCounter;
    }
    Prizes() {
        prizes = new PriorityQueue<>();
    }
    public void putPrize(Product product) {
        prizes.add(product);
    }
    public void printPrizes() {
        prizes.stream().sorted().forEach(System.out::println);
    }
    public PriorityQueue<Product> getPrizes() {return prizes;}
    public int size() {return prizes.size();}
    public void fill(int numberPrizes) {
        for (int i = 0; i < numberPrizes; i++) {
            prizes.add(generatePrize());
        }
    }
    private Product generatePrize() {
        int r = random.nextInt(20);
        switch (r) {
            case 0, 1, 2, 3, 4:
                return new Car("", 1);
            case 5, 6, 7:
                return new Robot("", 1);
            case 8, 9:
                return new Lego("", 1);
            default:
                return new Doll("", 1);
        }
    }
}
