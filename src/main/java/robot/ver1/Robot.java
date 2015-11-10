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
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();
    String name;
    /**
     * Робот управляется оператором.
     */
    Operator operator;

    public Robot() {
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(String name) {
        this.name = name;
    }

    /**
     * Можно узнать какой оператор управляет роботом
     * @return operator .
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Можно установить оператора для робота.
     * @param operator .
     */
    public void setOperator(Operator operator) {
        this.operator = operator;
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
    void forward(int distance){
        // Запоминаем координаты робота перед перемещением
        final double xOld = x;
        final double yOld = y;
        // Меняем координаты
        x = x+distance*Math.cos(course/180*Math.PI);
        y = y+distance*Math.sin(course/180*Math.PI);
        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine(xOld, yOld, x, y));
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "name = "+ name;
    }
}
