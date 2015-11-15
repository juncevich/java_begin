package robot.ver1;

/**
 * Created by Juncevich on 12.11.2015.
 */
public interface RobotListener {
    // Метод будет вызываться в момент начала движения
    public void startMove(double x, double y);
    // Метод будет вызываться в момент окончания движения
    public void endMove(double x, double y);
}
