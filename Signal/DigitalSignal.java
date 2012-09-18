package Signal;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.io.FileInputStream;
import javax.swing.JPanel;

/**
 *
 * @author cassianokc
 */
public class DigitalSignal extends Signal {

    public static final int FILE_ENDED = -1;
    public static final int SUCCESS = 0;
    byte current_value, next_value;
    byte next_position;

    public DigitalSignal() {
        current_value = 0;
        next_value = 0;
        next_position = Byte.SIZE;
    }

    public int update(FileInputStream r) {
        current_value = (byte) (current_value << 1);
        if (((next_value << next_position) & 1) != 0) {
            current_value |= 1;
        } else {
            current_value |= 0;
        }
        next_position--;
        if (next_position == -1) {
            try {
                next_value = (byte) r.read();
                next_position = Byte.SIZE;
                return SUCCESS;
            } catch (IOException ex) {
                next_value = 0;
                next_position = Byte.SIZE;
                return FILE_ENDED;
            }
        }
        return SUCCESS;
    }

    int getBit(byte pos) {
        return (current_value >> pos);
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
