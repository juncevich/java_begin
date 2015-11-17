package move;

import javax.swing.WindowConstants;

/**
 * Main class, that start program.
 */
final class MoveSquare {
    /**
     *
     */
    private MoveSquare() {
    }

    /**
     * The main method.
     * @param args .
     */
    public static void main(final String... args) {

        final MoveSquareFrame msf = new MoveSquareFrame();

        msf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        msf.setVisible(true);
    }
}
