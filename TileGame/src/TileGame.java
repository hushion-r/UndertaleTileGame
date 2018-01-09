import javax.swing.*;
import java.awt.*;

public class TileGame extends JComponent {
    /*
    RED - impassable
    YELLOW - electric
    GREEN - alarm for monster
    ORANGE - orange scented
    BLUE - water
    PURPLE - slide
    PINK - nothing

    IF:
    orange = true and blue - piranhas
    yellow next to blue - zap
    purple = true and blue - lemons, no piranhas
     */

    public static final int COLUMNS = 10;
    public static final int ROWS = 5;

    private static boolean passable = true;
    private static boolean attractsPiranhas = false;
    private static boolean damage = false;
    private static boolean slide = false;
    private static boolean electric = false;

    private JPanel tileGamePanel;
    private Graphics g;

    private final Tile[][] board = new Tile[COLUMNS][ROWS];
    private final Color[] tileColors = {Color.RED, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.BLUE, Color.MAGENTA, Color.PINK};

    public TileGame(JPanel tileGamePanel, Graphics g) {
        this.tileGamePanel = tileGamePanel;
        this.g = g;

        drawBoard();
    }

    public void drawBoard() {
        for (Tile[] tiles: board) {
            int x = 0;
            int y = TileGameWindow.WINDOW_HEIGHT - 60;
            for (Tile tile : tiles) {
                Double doub = new Double(Math.random()*100 % tileColors.length);
                tile = new Tile(tileColors[doub.intValue()], x, y);
                drawTile(tile, tile.getTileColor());
                x += Tile.TILE_LENGTH;
                x += 20;
            }
            y += Tile.TILE_LENGTH;
        }


    }

    public void drawTile(Tile tile, Color color){
//        Graphics2D.setPaint(color);
//        Graphics2D.fill(tile);
//        Graphics2D.draw(tile);
    }


    public void setPassable(boolean passable) {
        TileGame.passable = passable;
    }

    public void setAttractsPiranhas(boolean attractsPiranhas) {
        TileGame.attractsPiranhas = attractsPiranhas;
    }

    public void setDamage(boolean damage) {
        TileGame.damage = damage;
    }

    public void setSlide(boolean slide) {
        TileGame.slide = slide;
    }

    public boolean getAttractsPiranhas() {
        return attractsPiranhas;
    }
}
