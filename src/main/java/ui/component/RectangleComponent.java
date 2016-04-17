package ui.component;

import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class RectangleComponent extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
