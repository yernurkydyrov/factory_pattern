package abstractFactory.footballers;

import abstractFactory.positions.Midfielder;

public class Bellingham implements Midfielder {
    @Override
    public void assists() {
        System.out.println ("I am Jude Victor William Bellingham and i promise to give 15 assists per season.");
    }
}
