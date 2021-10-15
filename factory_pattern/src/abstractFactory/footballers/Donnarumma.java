package abstractFactory.footballers;

import abstractFactory.positions.Goalkeeper;

public class Donnarumma implements Goalkeeper {
    @Override
    public void keepDry() {
        System.out.println ("I am Gianluigi Donnarumma Cavaliere OMRI and i promise to make 37 and more dry match per season.");
    }
}
