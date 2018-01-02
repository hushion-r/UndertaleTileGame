import javax.swing.*;
import java.awt.*;

public class TileGameWindow extends JPanel {

    private JFrame tileGame;
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



    public static void main(String[] args) {
        TileGameWindow tileGameWindow = new TileGameWindow();
    }
}
