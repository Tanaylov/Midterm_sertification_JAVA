package Task;

import Task.Product.Product;

public class Participant {
    private String name;
    private boolean isWin = false;
    private Product winningToy;
    public Participant(String name) {this.name = name;}
    public boolean getIsWin() {
        return isWin;
    }
    public void setIsWin(boolean win) {isWin = win;}
    public void setWinningToy(Product product) {winningToy = product;}

    @Override
    public String toString() {
        if (winningToy == null) return name;
        return String.format("%s - %s", name, winningToy.toString());
    }
}
