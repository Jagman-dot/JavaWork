package udemy.section10.Challenge;

import udemy.section10.Team;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class LeagueStandings<T extends Team> {


    private String teamName;

    ArrayList<T> teams = new ArrayList<>();

    public LeagueStandings(String teamName) {
        this.teamName = teamName;

    }



    //adding team to teams
    public boolean addTeam(T team){

        if(teams.contains(team.getTeamName())){

            System.out.println(team.getTeamName() + " is already on team.");

            return false;
        } else {

            System.out.println(team.getTeamName() + " added to array of teams.");
            teams.add(team);

            return true;
        }
    }

    public void showStanding(){

        Collections.sort(teams);

        for(T t : teams){

            System.out.println(t.getTeamName() + ": " + t.ranking());

        }

    }

}
