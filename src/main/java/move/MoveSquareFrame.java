package move;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.HeadlessException;

/**
 *
 */
class MoveSquareFrame extends JFrame {
    /**
     *
     */
    public static final String UP = "UP";//NOPMD
    /**
     *
     */
    public static final String DOWN = "DOWN";
    /**
     *
     */
    public static final String LEFT = "LEFT";
    /**
     *
     */
    public static final String RIGHT = "RIGHT";
    /**
     *
     */
    private final static int INIT_X = 100;
    /**
     *
     */
    private final static int INIT_Y = 100;
    /**
     *
     */
    private final static int HEIGHT_WINDOW = 400;
    /**
     *
     */
    private final static int WIDTH_WINDOW = 400;


    /**
     *
     * @throws HeadlessException Test.
     */
    MoveSquareFrame() throws HeadlessException {
        super();
        final SquareComponent squareComponent = new SquareComponent();
        // Кладем компонент для
        // рисования квадрата
        add(squareComponent);
        // Создаем кнопку для посылки
        // команды движения вверх
        final JButton btnUP = new JButton(UP);
        // Устанавливаем ей идентификатор,
        // по которому сможем узнать эту кнопку
        btnUP.setActionCommand(UP);
        // Устанавливаем ей слушатель -
        // компонент для рисования квадрата
        btnUP.addActionListener(squareComponent);
        // Кладем кнопку на самый верх
        // формы - на север
        add(btnUP, BorderLayout.NORTH);
        // Создаем кнопку для посылки
        // команды движения вниз
        final JButton btnDown = new JButton(DOWN);
        // Устанавливаем ей идентификатор,
        // по которому сможем узнать эту кнопку
        btnDown.setActionCommand(DOWN);
        // Устанавливаем ей слушатель -
        // компонент для рисования квадрата
        btnDown.addActionListener(squareComponent);
        // Кладем кнопку на самый
        // низ формы - на юг
        add(btnDown, BorderLayout.SOUTH);
        // Устанавливаем координаты

        final JButton btnLeft = new JButton(LEFT);
        btnLeft.setActionCommand(LEFT);
        btnLeft.addActionListener(squareComponent);
        add(btnLeft, BorderLayout.WEST);


        final JButton btnRight = new JButton(RIGHT);
        btnRight.setActionCommand(RIGHT);
        btnRight.addActionListener(squareComponent);
        add(btnRight, BorderLayout.EAST);

        setBounds(INIT_X, INIT_Y, HEIGHT_WINDOW, WIDTH_WINDOW);
    }
}
