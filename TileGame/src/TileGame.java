import java.awt.*;

public class TileGame {
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

    private static boolean passable = true;
    private static boolean attractsPiranhas = false;
    private static boolean damage = false;
    private static boolean slide = false;
    private static boolean electric = false;

    TileGameWindow tileGameWindow;

    private final Tile[][] board = new Tile[10][5];
    private final Color[] tileColors = {Color.RED, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.BLUE, Color.MAGENTA, Color.PINK};

    public TileGame(TileGameWindow gameWindow) {
        this.tileGameWindow = gameWindow;
    }

    public void drawBoard() {
        for (Tile[] tiles: board) {
            int x = 0;
            int y = TileGameWindow.WINDOW_HEIGHT - 60;
            for (Tile tile : tiles) {
                Double doub = new Double(Math.random()*100 % tileColors.length);
//                tile = new Tile(tileColors[doub.intValue()]);
//                tile.setLocation(x, y);
//                x += 20;
//                tileGameWindow.add(tile);
            }
            y += 20;
        }


    }


    public static void setPassable(boolean passable) {
        TileGame.passable = passable;
    }

    public static void setAttractsPiranhas(boolean attractsPiranhas) {
        TileGame.attractsPiranhas = attractsPiranhas;
    }

    public static void setDamage(boolean damage) {
        TileGame.damage = damage;
    }

    public static void setSlide(boolean slide) {
        TileGame.slide = slide;
    }

    public static boolean getAttractsPiranhas() {
        return attractsPiranhas;
    }
}
