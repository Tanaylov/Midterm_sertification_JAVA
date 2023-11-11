package Task;

import java.util.ArrayList;
import java.util.Random;

public class Draw implements Rules {
    private ArrayList<Participant> participants;
    Random random = new Random();
    public Draw() {
        participants = new ArrayList<>();
    }
    @Override
    public void startDraw(Prizes prizes) {
        while (!prizes.getPrizes().isEmpty()) {
            int participantIndex = random.nextInt(participants.size());
            for (int i = 0; i < participants.size(); i++) {
                if (random.nextBoolean() && !participants.get(participantIndex).getIsWin()) {
                    participants.get(participantIndex).setWinningToy(prizes.getPrizes().poll());
                    participants.get(participantIndex).setIsWin(true);
                }
            }
        }
    }
    public ArrayList<Participant> generateParticipant(int participantCount) {
        String[] name = {"Ivan", "Nikolay", "Leonid", "Aleksandr", "Fedor", "Anna", "Alena", "Artem", "Denis",
                        "Victor", "Pavel", "Elena", "Maria", "Stanislav", "Victoria", "Vladimir", "Andrey", "Veronica"};
        for (int i = 0; i < participantCount; i++) {
            int nameIndex = random.nextInt(name.length);
            participants.add(new Participant(name[nameIndex]));
        }
        return participants;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void printListOfParticipant() {participants.forEach(System.out::println);}
    public void printWinnerList() {participants.forEach(el -> {if (el.getIsWin()) System.out.println(el);});}
}
