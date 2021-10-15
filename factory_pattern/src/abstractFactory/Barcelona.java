package abstractFactory;

import abstractFactory.club.FCBarcelonaFactory;
import abstractFactory.positions.*;

public class Barcelona {
    public static void main(String[] args) {
        PositionFactory position = new FCBarcelonaFactory ();
        Forward forward = position.getForward ();
        Midfielder midfielder = position.getMidfielder ();
        Defender defender = position.getDefender ();
        Goalkeeper goalkeeper = position.getGoalkeeper ();
        System.out.println (" === DREAM TEAM OF FC BARCELONA === ");
        forward.score ();
        midfielder.assists ();
        defender.tackles ();
        goalkeeper.keepDry ();
    }
}
