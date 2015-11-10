package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class OvalFrame extends JFrame {
    public OvalFrame() throws HeadlessException {
        OvalComponent ovalComponent = new OvalComponent();
        add(ovalComponent);
        setBounds(200,200,300,250);
    }
}
