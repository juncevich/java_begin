package ui.component;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class OvalComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(5,5,getWidth()-10,getHeight() -10);

    }
}
