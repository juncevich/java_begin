package ui.frame;

import ui.component.OvalComponent;

import javax.swing.JFrame;
import java.awt.HeadlessException;


public class OvalFrame extends JFrame {
    public OvalFrame() throws HeadlessException {
        OvalComponent ovalComponent = new OvalComponent();
        add(ovalComponent);

        setBounds(200, 200, 300, 250);
    }
}
