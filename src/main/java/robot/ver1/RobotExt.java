package robot.ver1;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class RobotExt extends Robot {
    public RobotExt(double x, double y) {
        super(x, y);
    }

    public void back(int distance){
        forward(- distance);
    }
}
