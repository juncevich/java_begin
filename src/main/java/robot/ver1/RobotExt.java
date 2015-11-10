package robot.ver1;

public class RobotExt extends Robot {
    public RobotExt(double x, double y) {
        super(x, y);
    }

    public RobotExt(double x, double y, double course) {
        super(x,y);
        this.course = course;
    }

    public void back(int distance){
        forward(- distance);
    }
}
