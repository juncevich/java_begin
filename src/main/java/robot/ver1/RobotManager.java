package robot.ver1;

/**
 *
 */
public class RobotManager {
    /**
     *
     * @param args All arguments.
     */
    public static void main(final String[] args) {
        RobotManager rm = new RobotManager();
        Robot robot = new Robot(20, 20);
        Robot robotWithName = new Robot("Robot with name.");
        System.out.println(robotWithName.toString());
        int distance = 40;

        robot.forward(distance);
        System.out.println("robot.getCourse() = " + robot.getCourse());

        rm.changeCourse(robot);
        System.out.println(robot.getCourse());

        RobotExt robotExt = new RobotExt(0, 0, 0);
        robotExt.forward(20);
        robotExt.printCoordinates();
        robotExt.setCourse(90);
        robotExt.forward(20);
        robotExt.printCoordinates();
        robotExt.back(20);
        robotExt.printCoordinates();

    }

    /**
     * Change course.
      * @param robot .
     */
    private void changeCourse(final Robot robot) {
            robot.setCourse(180);
    }

    }

