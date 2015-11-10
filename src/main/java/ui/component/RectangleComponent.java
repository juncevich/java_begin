package ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class RectangleComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawRect(5,5,getWidth() - 10, getHeight() - 10);
    }
}
