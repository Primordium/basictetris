import javax.swing.*;
import java.io.ByteArrayInputStream;

public class Window {

    private static final int WIDTH=318;
    private static final int HEIGHT=640;
    private JFrame window;
    private Board board;

    public Window() {
        window = new JFrame("Tetris");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        board = new Board();


        window.add(board);
        window.addKeyListener(board);
        window.setVisible(true);
    }

    public static void main(String[] args) {

        new Window();

    }
}
