package factory.watcher;

import factory.footballers.Haaland;
import factory.footballers.Iniesta;
import factory.footballers.Messi;
import factory.footballers.Xavi;

public class FootballerFactory {
    public Footballer transfer(String newClub) {
        return switch (newClub) {
            case "Messi" -> new Messi ();
            case "Xavi" -> new Xavi ();
            case "Iniesta" -> new Iniesta ();
            case "Haaland" -> new Haaland ();
            default -> null;
        };
    }
}
