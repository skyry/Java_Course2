package generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name, List<Participant> participants) {
        this.name = name;
        this.participants = participants;
    }

    public void addNewParticipants(Participant participant){
        participants.add(participant);
        System.out.println("In command "+ name+ " add new participant"+ participant.getName());
    }

    public void playWith(Team team){
        String winnerName;
        Random r = new Random();
        int i = r.nextInt(2);
        if (i==0){
            winnerName = this.name;
        }
        else winnerName = team.name;
        System.out.println("Winner: " + winnerName);
    }
}
