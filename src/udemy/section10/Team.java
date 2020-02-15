package udemy.section10;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    // this is all team related information
    private String teamName;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // an arraylist of Players on a team
    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){

        if(members.contains(player)){

            // then we don't want to add
            System.out.println(player.getName() + " is already on team.");
            return false;

        } else{

            members.add(player);
            System.out.println(player.getName() + " has been picked for " + this.teamName);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matachResult(Team<T> opponent, int theirScore, int ourScore){

        String message;
        if(ourScore > theirScore){
            // if our score is greater than update our won to ++
           won++;
           message = " beat ";
        } else if (ourScore == theirScore){
            // if the game was tied
            tied++;
            message = " drew ";
        } else{

            lost++;
            message = " lost to ";
        }
        played++;

        // if the opponent is not null
        if(opponent != null){

            System.out.println(this.teamName + message + opponent.getTeamName());
            // we will call the same method(matachResult) but from the opponents persective to upload their won/loss/played fields
            opponent.matachResult(null, ourScore, theirScore);
        }
    }

    public int ranking(){

        return won - lost;
    }


    @Override
    public int compareTo(Team<T> team) {
        // -1 = if this is less than the object -- sort earlier than
        // 0 = equal
        // +1 = this is greater than -- sort earlier than

        if(this.ranking() > team.ranking()){

            // if this team has a higher ranking then -1 to show this team should be placed earlier

            return -1;
        } else if (this.ranking() < team.ranking()){

            return 1;
        } else {

            return 0;
        }
    }
}
