package Gassociation.test;

import Gassociation.domain.Player;
import Gassociation.domain.Team;

public class PlayerTest03 {
    static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Cafú");
        Team team = new Team("Brazil");
        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("---Player---");
        player1.print();

        System.out.println("---Team---");
        team.print();
    }
}
