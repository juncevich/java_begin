package robot.ver1;

/**
 *
 */
public class RobotManager {
    /**
     *
     * @param args All arguments.
     */
    public static void main(String[] args) {
        /**
         * Ссылка r1 указывает на один объект.
         */
        Robot r1 = new Robot();
        /**
         * Ссылка r2 указывает на другой объект.
         */
        Robot r2 = new Robot();
        r1.setX(99);
        r2.setX(123);

        System.out.println(r1.getX());
        System.out.println(r2.getX());

    }
}
