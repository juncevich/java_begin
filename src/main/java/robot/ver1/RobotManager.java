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
        Robot[] robots = new Robot[10];

        for (int i = 0; i < robots.length; i++) {
            robots[i]= new Robot(i*10, i*10);

        }

        for (int i = 0; i < robots.length; i++) {
            robots[i].printCoordinates();
        }

    }

    /**
     * Change course.
      * @param robot .
     */
    private void changeCourse(final Robot robot) {
            robot.setCourse(180);
    }

    }

