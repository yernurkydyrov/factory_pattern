package abstractFactory.positions;

public interface PositionFactory {
    Forward getForward();
    Midfielder getMidfielder();
    Defender getDefender();
    Goalkeeper getGoalkeeper();
}
