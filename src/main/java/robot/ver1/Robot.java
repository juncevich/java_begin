package robot.ver1;

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
    private double course = 0;
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
        x=x+distance*Math.cos(course/180*Math.PI);
        y=y+distance*Math.sin(course/180*Math.PI);
    }
}
