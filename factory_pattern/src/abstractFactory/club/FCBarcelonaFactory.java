package abstractFactory.club;

import abstractFactory.footballers.Araujo;
import abstractFactory.footballers.Fati;
import abstractFactory.footballers.Pedri;
import abstractFactory.footballers.terStegen;
import abstractFactory.positions.*;

public class FCBarcelonaFactory implements PositionFactory {
    @Override
    public Forward getForward() {
        return new Fati ();
    }

    @Override
    public Midfielder getMidfielder() {
        return new Pedri ();
    }

    @Override
    public Defender getDefender() {
        return new Araujo ();
    }

    @Override
    public Goalkeeper getGoalkeeper() {
        return new terStegen ();
    }
}
