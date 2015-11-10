package robot.ver1;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class RobotTotal extends Robot {

    private double totalDistance = 0;

    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    void forward(int distance) {
        super.forward(distance);
        totalDistance +=distance;
    }
}
