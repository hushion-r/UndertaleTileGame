import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TileGameWindow extends JPanel implements KeyListener {

    private JFrame window;
    private JComponent board;
    public final JLabel TITLE = new JLabel("Undertale Tile Game");
    private final JTextArea instructions = new JTextArea("RED - impassable\t" +
            "YELLOW - electric\t" +
            "GREEN - alarm for monster\t" +
            "ORANGE - orange scented\t" +
            "BLUE - water\t" +
            "PURPLE - slide\t" +
            "PINK - nothing\t" +
            "\n" +
            "IF:\t" +
            "orange = true and blue - piranhas\n" +
            "yellow next to blue - zap\n" +
            "purple = true and blue - lemons, no piranhas");
    private TileGame tileGame;

    public static final int WINDOW_WIDTH = 4000;
    public static final int WINDOW_HEIGHT = 1000;


    public TileGameWindow() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, TileGameWindow.WINDOW_HEIGHT));
        setBackground (Color.white);

//        tileGame = new TileGame(this);

        window = new JFrame ("Undertale Tile Game");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(this);
        window.pack();
        window.setVisible(true);

        setComponents();
    }

    public void setComponents() {
        TITLE.setFont(new Font("ComicSans", Font.BOLD, 100));
        TITLE.setHorizontalAlignment(SwingConstants.CENTER);
        TITLE.setHorizontalTextPosition(SwingConstants.CENTER);
        TITLE.setVerticalTextPosition(SwingConstants.TOP);

        instructions.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        instructions.setBounds(100, 300, WINDOW_WIDTH, 100);
        instructions.setWrapStyleWord(true);

        tileGame.setForeground(Color.RED);
        tileGame.setBackground(Color.BLUE);
        tileGame.setVisible(true);

        add(TITLE);
        add(instructions);
        add(tileGame);
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
