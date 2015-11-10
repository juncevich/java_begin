package ui;

import ui.frame.ShapeFrame;

import javax.swing.*;

/**
 * Created by Juncevich on 10.11.2015.
 */
public class ShapeApplication {
    public static void main(String[] args) {
        ShapeFrame shapeFrame = new ShapeFrame();
        shapeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        shapeFrame.setVisible(true);
    }
}
