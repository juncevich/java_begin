package ui.component;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;

public class OvalComponent extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
