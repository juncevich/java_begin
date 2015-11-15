package ui;

import ui.frame.ShapeFrame;

import javax.swing.*;


public class ShapeApplication {
    public static void main(String[] args) {
        ShapeFrame shapeFrame = new ShapeFrame();
        shapeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        shapeFrame.setVisible(true);
    }
}
