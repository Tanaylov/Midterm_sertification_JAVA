package Task;

import Task.Product.Toy.*;

public class Main {
    public static void main(String[] args) {
        Prizes prizes = new Prizes();
        prizes.fill(11);
        prizes.printPrizes();
        Draw draw = new Draw();
        draw.generateParticipant(15);
        draw.printListOfParticipant();
        draw.startDraw(prizes);
        System.out.println("--".repeat(33));
        draw.printWinnerList();
        Save save = new Save();
        save.saveInFile(draw.getParticipants(), "par");
    }
}