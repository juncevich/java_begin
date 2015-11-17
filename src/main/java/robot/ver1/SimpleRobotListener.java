package robot.ver1;

// Наш класс реализует интерфейс robotListener
public class SimpleRobotListener implements RobotListener
{


    public void startMove(double x, double y)
    {
        System.out.println("Робот начал движение, координаты:" + x + "," + y);
    }


    public void endMove(double x, double y){ System.out.println("Робот закончил движение, координаты:" + x + "," + y); }
}
