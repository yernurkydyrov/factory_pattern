package abstractFactory;

import abstractFactory.club.FCBorussiaDortmundFactory;
import abstractFactory.positions.*;

public class BorussiaDortmund {
    public static void main(String[] args) {
        PositionFactory position = new FCBorussiaDortmundFactory ();
        Forward forward = position.getForward ();
        Midfielder midfielder = position.getMidfielder ();
        Defender defender = position.getDefender ();
        Goalkeeper goalkeeper = position.getGoalkeeper ();
        System.out.println (" === DREAM TEAM OF FC Dortmund === ");
        forward.score ();
        midfielder.assists ();
        defender.tackles ();
        goalkeeper.keepDry ();
    }
}
