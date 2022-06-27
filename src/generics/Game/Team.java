package generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipants(T participant) {
        participants.add(participant);
        System.out.println("In command: " + name + " add new participant: " + participant.getName());
    }

    public void playWith(Team<T> team) {
        //String winnerName = null;
        Random r = new Random();
        int i = r.nextInt(3);
        if (i == 0) {
            System.out.println("Winner command: " + this.name);
        } else if (i == 1) {
            System.out.println("Winner command: " + team.name);
        } else {
            System.out.println("Draw");
        }
    }
}
