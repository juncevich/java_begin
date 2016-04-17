package ui.component;

import java.awt.*;

public class TriangleComponent extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.setColor(Color.green);
        g.drawLine(5,getHeight() - 10, getWidth()/2 - 5, 5);
        g.setColor(Color.MAGENTA);
        g.drawLine(getWidth()/2 - 5, 5,getWidth() - 10, getHeight() - 10);
        g.setColor(Color.ORANGE);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }

}
