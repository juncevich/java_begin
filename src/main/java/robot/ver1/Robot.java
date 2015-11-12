package robot.ver1;

import java.util.ArrayList;

/**
 *
 */
class Robot {
    /**
     * Текущая координата X.
     */
    private double x = 0;
    /**
     * Текущая координата У.
     */
    private double y = 0;
    /**
     * Текущий курс в (градусах).
     */
    protected double course = 0;
    private ArrayList <RobotLine> lines = new ArrayList<RobotLine>();
    private RobotListener listener;
    /**
     * Робот управляется оператором.
     */

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setListener(RobotListener listener){
        this.listener = listener;
    }
    void forward(int distance){
        // Вызываем слушателя (если он установлен) в начале
        if (listener!=null){
        listener.startMove(x,y);
    }
        final double xOld = x;
        final double yOld = y;
        x = x+distance*Math.cos(course/180*Math.PI);
        y = y+distance*Math.sin(course/180*Math.PI);

        if (listener == null) {
            listener.endMove(x, y);
        }

        lines.add(new RobotLine(xOld,yOld,x,y));
    }
    public ArrayList<RobotLine> getLines(){
        return lines;
    }
    /**
     *
     * @return x.
     */
    public double getX() {
        return x;
    }
    /**
     *
     * @param x Текущая координата X.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *
     * @return y.
     */
    public double getY() {
        return y;
    }

    /**
     *
     * @param y Текущая координата У.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @return course.
     */
    public double getCourse() {
        return course;
    }

    /**
     *
     * @param course Текущий курс в (градусах).
     */
    public void setCourse(double course) {
        this.course = course;
    }

    /**
     * Печать координат робота.
     */
    void printCoordinates(){
        System.out.println(x + "," + y);
    }
    /**
     *
     */


}
