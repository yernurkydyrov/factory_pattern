package abstractFactory.footballers;

import abstractFactory.positions.Goalkeeper;

public class terStegen implements Goalkeeper {
    @Override
    public void keepDry() {
        System.out.println ("I am Marc-André ter Stegen and i promise to make 30 and more dry match per season.");
    }
}
