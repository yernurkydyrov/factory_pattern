package factory.footballers;

import factory.watcher.Footballer;

public class Messi extends Footballer {

    public Messi() {
        setFullName ( "Lionel Andres Messi" );
        setPromisedGoals ( 50 );
        setPromisedAssists ( 20 );
        setCurrentClub ( "FC Barcelona" );
        setPrice ( 150 );
    }
}
