import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TileGameWindow extends JPanel implements KeyListener {

    private JFrame tileGame;
    private JPanel board;
    private JPanel text;
    private JLabel title;
    private JLabel instructions;
    public static final int WINDOW_HEIGHT = 600;


    public TileGameWindow() {
        setPreferredSize(new Dimension(1000, TileGameWindow.WINDOW_HEIGHT));
        setBackground (Color.white);


        tileGame = new JFrame ("Undertale Tile Game");
        tileGame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        tileGame.getContentPane().add(this);
        tileGame.pack();
        tileGame.setVisible(true);
    }

    public static void setPanels() {

    }

    public static void main(String[] args) {
        TileGameWindow tileGameWindow = new TileGameWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
