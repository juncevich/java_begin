package ui.frame;

import ui.component.OvalComponent;
import ui.component.RectangleComponent;
import ui.component.TriangleComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class ShapeFrame extends JFrame {
    public ShapeFrame() throws HeadlessException {
        setLayout(new GridLayout(2, 3));

        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());

        setBounds(200, 200, 450, 350);
    }
}
