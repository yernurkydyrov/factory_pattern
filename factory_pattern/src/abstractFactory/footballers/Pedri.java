package abstractFactory.footballers;

import abstractFactory.positions.Midfielder;

public class Pedri implements Midfielder {
    @Override
    public void assists() {
        System.out.println ("I am Pedro González López and i promise to give 25 assists per season.");
    }
}
