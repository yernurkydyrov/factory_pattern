package abstractFactory.footballers;

import abstractFactory.positions.Defender;

public class Araujo implements Defender {
    @Override
    public void tackles() {
        System.out.println ("I am Ronald Federico Araújo da Silva and I promise to make 100 and more tackles per season.");
    }
}
