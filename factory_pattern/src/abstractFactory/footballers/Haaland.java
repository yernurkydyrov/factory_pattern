package abstractFactory.footballers;

import abstractFactory.positions.Forward;

public class Haaland implements Forward {
    @Override
    public void score() {
        System.out.println ("I am Erling Braut Haaland and i promise to score 70 goals per season.");
    }
}
