package robot.ver1;

/**
 * Created by Juncevich on 12.11.2015.
 */
public interface RobotListener {
    // Метод будет вызываться в момент начала движения
    void startMove(double x, double y);
    // Метод будет вызываться в момент окончания движения
    void endMove(double x, double y);
}
