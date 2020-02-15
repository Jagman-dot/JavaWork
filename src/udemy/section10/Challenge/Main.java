package udemy.section10.Challenge;

import udemy.section10.Team;

public class Main {

    public static void main(String[] args) {


        //ArrayList<Team> teams
        //Collections.sort(teams)
        // create a generic class to implement a league table for a sport
        //this class should allow teams to be added to the list, and store
        // a list of teams that belong to league

        // Your class should have a method to print out the teams in order
        // with your team at the top of the league printed first

        // only teams of teh same type should be added to any particlar
        // create a generic class to implement a league table or standing
        // class should allow teams to be added and store list of teams that belong to the team
        // method to print out the teams in order

        BasketBallPlayer bron = new BasketBallPlayer("Lebron James");
        BasketBallPlayer pg = new BasketBallPlayer("Paul Geroge");
        BasketBallPlayer kd = new BasketBallPlayer("Kevin Durant");
        BasketBallPlayer curry = new BasketBallPlayer("S Curry");
        BasketBallPlayer luka = new BasketBallPlayer("Luka Donic");

        Team<BasketBallPlayer> lakers = new Team<>("LA Lakers");
        Team<BasketBallPlayer> clippers = new Team<>("LA Clippers");
        Team<BasketBallPlayer> nets = new Team<>("BK Nets");
        Team<BasketBallPlayer> warriors = new Team<>("GS Warriors");
        Team<BasketBallPlayer> mavs = new Team<>("DAL Mavericks");

        lakers.addPlayer(bron);
        clippers.addPlayer(pg);
        nets.addPlayer(kd);
        warriors.addPlayer(curry);
        mavs.addPlayer(luka);

        lakers.matachResult(clippers, 100, 120);
        lakers.matachResult(nets, 100, 120);
        lakers.matachResult(warriors, 100, 120);

        clippers.matachResult(nets,100,90);
        clippers.matachResult(warriors,85,90);
        clippers.matachResult(mavs,100,90);

        nets.matachResult(warriors,100,110);
        nets.matachResult(mavs,100,110);
        nets.matachResult(lakers,120,110);

        warriors.matachResult(mavs, 100,110);
        warriors.matachResult(lakers, 120,110);
        warriors.matachResult(clippers, 100,110);

        mavs.matachResult(lakers, 100, 90);
        mavs.matachResult(clippers, 100, 190);
        mavs.matachResult(nets, 100, 90);

        LeagueStandings<Team> standings = new LeagueStandings<>("Standings");

        standings.addTeam(lakers);
        standings.addTeam(clippers);
        standings.addTeam(nets);
        standings.addTeam(warriors);
        standings.addTeam(mavs);

        standings.showStanding();
    }



}
