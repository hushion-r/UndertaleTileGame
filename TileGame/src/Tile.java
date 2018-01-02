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

    private Color tileColor;
    Paint fill;


    public Tile(Color tileColor, Graphics2D graphics2D) {
        this.tileColor = tileColor;
        this.width = 20;
        this.height = 20;

        graphics2D.fill(this);
        graphics2D.setColor(tileColor);
        
        giveProperties(tileColor);
    }

    /**
     * Gives action to Tile based on color.
     * Assumes no other colors will be used in constructor.
     * @param color
     */
    public void giveProperties(Color color) {
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
