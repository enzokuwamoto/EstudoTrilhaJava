package Gassociation.test;

import Gassociation.domain.Player;
import Gassociation.domain.Team;

public class PlayerTest02 {
    static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("Brazil's National Team");

        player1.setTeam(team1);

        player1.print();
    }
}
