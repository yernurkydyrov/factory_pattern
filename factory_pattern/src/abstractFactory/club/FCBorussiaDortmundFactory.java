package abstractFactory.club;

import abstractFactory.footballers.*;
import abstractFactory.positions.*;

public class FCBorussiaDortmundFactory implements PositionFactory {
    @Override
    public Forward getForward() {
        return new Haaland ();
    }

    @Override
    public Midfielder getMidfielder() {
        return new Bellingham ();
    }

    @Override
    public Defender getDefender() {
        return new Akanji ();
    }

    @Override
    public Goalkeeper getGoalkeeper() {
        return new Donnarumma ();
    }
}
