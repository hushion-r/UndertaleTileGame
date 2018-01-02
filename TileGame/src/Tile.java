import sun.java2d.SunGraphics2D;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Tile extends Rectangle2D.Double {

    /*
    RED - impassable
    YELLOW - electric
    GREEN - alarm for monster
    ORANGE - orange scented
    BLUE - water
    PURPLE - slide. lemon scented
    PINK - nothing

    IF:
    orange = true and blue - piranhas
    yellow next to blue - zap
    purple = true and blue - lemons, no piranhas
    */


    public static final int TILE_LENGTH = 20;

    private Color tileColor;
    private Paint fill;


    public Tile(Color tileColor, double x, double y) {
        super(x, y, TILE_LENGTH, TILE_LENGTH);
        this.tileColor = tileColor;
        fill = tileColor;
        
        properties(tileColor);
    }

    public void paint(Graphics2D g) {
        g.setPaint(tileColor);
        g.fill(this);
    }

    /**
     * Gives action to Tile based on color.
     * Assumes no other colors will be used in constructor.
     * @param color
     */
    public void properties(Color color) {
        if (color.equals(Color.RED)) {
            red();
        } else if (color.equals(Color.YELLOW)) {
            yellow();
        } else if (color.equals(Color.GREEN)) {
            green();
        } else if (color.equals(Color.ORANGE)) {
            orange();
        } else if (color.equals(Color.BLUE)) {
            blue();
        } else if (color.equals(Color.MAGENTA)) {
            purple();
        } else {
            pink();
        }
    }

    /**
     * impassable.
     */
    public void red() {
        TileGame.setPassable(false);
    }

    /**
     * electric.
     * damages.
     */
    public void yellow() {
        TileGame.setDamage(true);
        // electricityAnim();
    }

    /**
     * alarm for monster
     */
    public void green() {
        TileGame.setDamage(true);
        // monsterAnim();
    }

    /**
     * smell like oranges.
     * if step on blue, piranhas will appear.
     * damages.
     */
    public void orange() {
        TileGame.setAttractsPiranhas(true);
    }

    /**
     * water.
     * piranhas?
     */
    public void blue() {
        boolean attractsPiranhas = TileGame.getAttractsPiranhas();
        if (attractsPiranhas = true) {
            TileGame.setDamage(true);
            // piranhaAnim();
        }
//        if (surrounding tile = yellow){
//            TileGame.setDamage(true);
//            waterElectricityAnim();
//        }
    }

    /**
     * slide and smell like lemons.
     * if step on blue, no piranhas.
     */
    public void purple() {
        TileGame.setSlide(true);
        TileGame.setAttractsPiranhas(false);
    }

    /**
     * does nothing
     */
    public void pink() {

    }


    public Color getTileColor() {
        return tileColor;
    }
}
