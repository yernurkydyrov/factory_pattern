package factory;

import factory.watcher.Footballer;
import factory.watcher.FootballerFactory;

import java.util.Scanner;

public class PSG {
    public static void main(String[] args) {
        FootballerFactory footballerFactory = new FootballerFactory ();
        Footballer footballer = null;
        Scanner nameOfFootballer = new Scanner ( System.in );
        System.out.println ("Mr.Nasser Al-Khelaifi, who do you want to buy at factory.PSG?");
        if(nameOfFootballer.hasNextLine ()) {
            String typeOfFootballer = nameOfFootballer.nextLine ();
            footballer = footballerFactory.transfer ( typeOfFootballer );
        }
        if (footballer == null) {
            System.err.println ("Mr.Nasser Al-Khelaifi, check again, I strongly advise you to check the information you have given as this player is not currently available on the transfer market.");
        } else {
            footballer.display ();
        }
    }
}
