package move;

import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static move.MoveSquareFrame.*;

/**
 * Наш класс умеет получать события
 * от кнопки т.к. реализует интерфейс ActionListener
 */
class SquareComponent extends JComponent implements ActionListener { //NOPMD
    /**
     * Определяем константу
     * для размера квадрата.
     */
    private static final int SQUARE_SIZE = 30;
    /**
     * Определяем константу
     * для шага.
     */
    private static final int STEP = 10;
    /**
     * Определяем поля для хранения
     * текущих координат квадрата.
     */
    private int x = 0; //NOPMD
    /**
     *
     */
    private int y = 0; //NOPMD

    /**
     *
     * @param actionEvent event.
     */
    public void actionPerformed(final ActionEvent actionEvent) {
        // Входной параметр содержит ссылку
        // на того, кто послал сообщение.
        // Получает объект с помощью
        // вызова getSource()
        // С помощью слова instanceof мы можем
        // проверить, что объект принадлежит
        // классу JButton (или его потомку)
        if (actionEvent.getSource() instanceof JButton) {
            // Приводим объект к типу JButton
            final JButton button = (JButton) actionEvent.getSource();
// Сравниваем команду со строкой UP
            if (UP.equals(button.getActionCommand())) {
// Вверх двигаемся уменьшением координаты Y
                y -= STEP;
            }
// Сравниваем команду со строкой DOWN
            if (DOWN.equals(button.getActionCommand())) {
                // Вниз двигаемся
                // увеличением координаты Y
                y += STEP;
            }

            if (LEFT.equals((button.getActionCommand()))) { //NOPMD
                x -= STEP;
            }

            if (RIGHT.equals(button.getActionCommand())) {
                x += STEP;
            }

            // Перерисовываем компонент
            // для обновления экрана
            repaint();

        }

    }

    /**
     *
     * @param graphics graph.
     */
    @Override
    protected void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
    }
}
