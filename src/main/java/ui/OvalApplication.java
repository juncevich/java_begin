package ui;

import ui.frame.OvalFrame;

import javax.swing.WindowConstants;


public class OvalApplication  {
    public static void main(String[] args) {
        OvalFrame ovalFrame = new OvalFrame();
        ovalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ovalFrame.setVisible(true);
    }
}
