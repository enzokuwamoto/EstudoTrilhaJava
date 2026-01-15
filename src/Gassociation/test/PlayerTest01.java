package Gassociation.test;

import Gassociation.domain.Player;

public class PlayerTest01 {
    static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romário");
        Player p3 = new Player("Cafú");

//        Player[] players = new Player[3];
//        players[0] = p1;
//        players[1] = p2;
//        players[2] = p3;

//        Player[] players = new Player[]{p1, p2, p3};

        Player[] players = {p1, p2, p3};

        for (Player player : players) {
            player.print();
        }

    }
}
