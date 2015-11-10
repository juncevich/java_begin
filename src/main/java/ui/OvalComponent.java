package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class OvalComponent extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5,5,getWidth()-10,getHeight() -10);
    }
}
