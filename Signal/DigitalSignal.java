package Signal;

import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cassianokc
 */
public class DigitalSignal extends Signal {

    byte info;

    public DigitalSignal() {
        this.info = 0;
    }

    public DigitalSignal(InputStreamReader r) throws IOException {
        int tmp;
        tmp = r.read();
        if (tmp != -1) {
            info = (byte) tmp;
        }
    }

    AnalogicSignal toAnalogicSignal() {
        AnalogicSignal anasig = new AnalogicSignal();
        int count1, count2;
        for (count1 = 0; count1 < Byte.SIZE; count1++) {
            for (count2 = 0; count2 < Byte.SIZE; count2++) {
                int bit = getBit(count2) == 0 ? -1 : 1;
                anasig.setA(anasig.getA(count1) + bit * Math.cos(count2), count1);
                anasig.setB(anasig.getA(count1) + bit * Math.sin(count2), count1);
            }
            anasig.setA0(anasig.getA0() + getBit(count1));
            anasig.setA(anasig.getA(count1) * 2.0 / ((double) Byte.SIZE), count1);
            anasig.setB(anasig.getB(count1) * 2.0 / ((double) Byte.SIZE), count1);
        }
        return anasig;
    }

    void setBit(int bit, boolean value) {
        if (value == true) {
            this.info |= (1 << bit);
        } else {
            info &= ~(1 << bit);
        }
    }

    int getBit(int bit) {
        return (info & (1 << bit)) == 0 ? 0 : 1;

    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
