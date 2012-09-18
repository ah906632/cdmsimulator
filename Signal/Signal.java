/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Signal;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author cassianokc
 */
public abstract class Signal {

    public abstract void draw(Graphics g);

    public static void drawCartesianPlane(Graphics g, int x0, int y0, int x1, int y1) {
        int middley = (y1 - y0) / 2;
        g.setColor(Color.red);
        g.drawLine(x0, middley + y0, x1, middley + y0); /* x axis */
        g.drawLine(x0, y0, x0, y1); /* y axis */
    }
}
