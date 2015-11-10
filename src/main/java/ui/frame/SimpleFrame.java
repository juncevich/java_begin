package ui.frame;

import javax.swing.JFrame;

/**
 * Simple GUI class, that create simple window.
 */
public class SimpleFrame {
    /**
     *
     * @param args All argements.
     */
    public static void main(String[] args) {
        JFrame sf = new JFrame();
        /**
         * Установим заголовок.
         */
        sf.setTitle("Test window");
        /**
         * Установим свойство - завершить приложение при закрытии окна
         *
         */
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Выставим координаты и размеры.
         * Верхний левый угол - первые два числа 100 и 100.
         * Ширина и высота - вторы два числа 400 и 200.
         */
        sf.setBounds(100, 100, 400, 200);
        /**
         * Отобразим окно, сделав его видимым
         */
        sf.setVisible(true);
    }
}
