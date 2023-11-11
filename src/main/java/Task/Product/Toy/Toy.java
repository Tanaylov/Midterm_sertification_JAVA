package Task.Product.Toy;

import Task.Product.Product;

import java.util.Random;

public abstract class Toy extends Product {
    Toy() {}
    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
        category = Toy.class.getSimpleName();
        id = category + idCounter;
    }
    public int getId() {return 0;}
}
