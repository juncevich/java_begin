package ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class TriangleComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.drawLine(5,getHeight() - 10, getWidth()/2 - 5, 5);
        g.setColor(Color.MAGENTA);
        g.drawLine(getWidth()/2 - 5, 5,getWidth() - 10, getHeight() - 10);
        g.setColor(Color.ORANGE);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
}
