package move;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

/**
 * Created by Alex on 16.11.2015.
 */
public class MoveSquareFrame extends JFrame {
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";

    public MoveSquareFrame() throws HeadlessException {
        SquareComponent sc = new SquareComponent();
// Кладем компонент для рисования квадрата
        add(sc);
// Создаем кнопку для посылки команды движения вверх
        JButton btnUP = new JButton(UP);
// Устанавливаем ей идентификатор, по которому сможем узнать эту кнопку
        btnUP.setActionCommand(UP);
// Устанавливаем ей слушатель - компонент для рисования квадрата
        btnUP.addActionListener(sc);
// Кладем кнопку на самый верх формы - на север
        add(btnUP, BorderLayout.NORTH);
// Создаем кнопку для посылки команды движения вниз
        JButton btnDown = new JButton(DOWN);
// Устанавливаем ей идентификатор, по которому сможем узнать эту кнопку
        btnDown.setActionCommand(DOWN);
// Устанавливаем ей слушатель - компонент для рисования квадрата
        btnDown.addActionListener(sc);
// Кладем кнопку на самый низ формы - на юг
        add(btnDown, BorderLayout.SOUTH);
// Устанавливаем координаты
        setBounds(100, 100,400,400);
    }
}
