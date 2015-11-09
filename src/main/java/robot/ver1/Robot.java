package robot.ver1;

/**
 *
 */
class Robot {
    /**
     * Текущая координата X.
     */
    private int x = 0;
    /**
     * Текущая координата У.
     */
    private int y = 0;
    /**
     * Текущий курс в (градусах).
     */
    private int course = 0;
    /**
     *
     * @return x.
     */
    public int getX() {
        return x;
    }
    /**
     *
     * @param x Текущая координата X.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return y.
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y Текущая координата У.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return course.
     */
    public int getCourse() {
        return course;
    }

    /**
     *
     * @param course Текущий курс в (градусах).
     */
    public void setCourse(int course) {
        this.course = course;
    }
}
