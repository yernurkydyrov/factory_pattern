package abstractFactory.footballers;

import abstractFactory.positions.Defender;

public class Akanji implements Defender {
    @Override
    public void tackles() {
        System.out.println ("I am Manuel Obafemi Akanji and I promise to make 70 and more tackles per season.");
    }
}
