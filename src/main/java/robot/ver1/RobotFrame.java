package robot.ver1;

import javax.swing.*;

/**
 * Created by Juncevich on 12.11.2015.
 */
public class RobotFrame extends JFrame{
    public RobotFrame(Robot robot) {
        // Устанавливаем заголовок окна
        setTitle("Robot Frame");
        // Добавляем компонент для рисования пути робота
        add(new RobotPathComponent(robot));
        // Устанавливаем размеры окна
        setBounds(100, 100, 500, 500);
}}
