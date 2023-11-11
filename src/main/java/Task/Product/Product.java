package Task.Product;

public abstract class Product implements Comparable<Product>{
    protected String name;
    protected String category;
    protected int price;
    protected String id;
    protected static int idCounter;

    {
        ++idCounter;

    }
    protected Product() {}

    @Override
    public int compareTo(Product product) {
        if (product == null) return -1;
        int delta = price - product.price;
        if (delta != 0) return -delta;
        return name.compareTo(product.name);
    }
    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, price, id);
    }

}
