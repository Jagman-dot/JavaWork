package udemy.section10;

import udemy.section10.BaseballPlayer;
import udemy.section10.FootballPlayer;
import udemy.section10.SoccerPlayer;
import udemy.section10.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        FootballPlayer obj = new FootballPlayer("Odell Beckham Jr.");
        BaseballPlayer arron = new BaseballPlayer("Arron Judge");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<SoccerPlayer> nyfc = new Team<>("NYFC");

        nyfc.addPlayer(beckham);

        Team<BaseballPlayer> nyk = new Team<>("NY Yankees");

        nyk.addPlayer(arron);

        Team<BaseballPlayer> nym = new Team<>("NY Mets");
        Team<BaseballPlayer> astros = new Team<>("Astros");
        Team<BaseballPlayer> SF = new Team<>("SF 49ers");

        nyk.matachResult(astros,2,5);
        nyk.matachResult(nym,1,2);
        astros.matachResult(SF, 1,1);
        SF.matachResult(nym,5,7);

        System.out.println(nyk.ranking());
        System.out.println(SF.ranking());

        System.out.println(nyk.compareTo(SF));
        System.out.println(nyk.compareTo(astros));






    }
}
