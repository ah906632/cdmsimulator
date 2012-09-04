package Signal;

import java.awt.Graphics;

/**
 *
 * @author cassianokc
 */
public class AnalogicSignal extends Signal {

    private double a0;
    private double a[];
    private double b[];

    public AnalogicSignal() {
        int count1;
        a = new double[Byte.SIZE];
        b = new double[Byte.SIZE];
        a0 = 0.0;
        for (count1 = 0; count1 < Byte.SIZE; count1++) {
            a[count1] = 0.0;
            b[count1] = 0.0;
        }
    }

    double SignalValue(double x) {
        int count1;
        double val = a[0] / 2;
        for (count1 = 0; count1 < Byte.SIZE; count1++) {
            val += a[count1] * Math.cos(count1 * x);
            val += b[count1] * Math.sin(count1 * x);
        }
        return x;
    }

    DigitalSignal toDigitalSignal() {
        int count1;
        double x;
        DigitalSignal digsig = new DigitalSignal();
        for (x = 0.5, count1 = 0; count1 < Byte.SIZE; x = x + 1.0, count1++) {
            if (SignalValue(x) >= 0) {
                digsig.setBit(count1, true);
            } else {
                digsig.setBit(count1, false);
            }

        }
        return digsig;
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getA0() {
        return this.a0;
    }

    public void setA0(double a0) {
        this.a0 = a0;
    }

    public double getA(int x) {
        return this.a[x];
    }

    public void setA(double a, int x) {
        this.a[x] = a;
    }

    public double getB(int x) {
        return this.b[x];
    }

    public void setB(double b, int x) {
        this.b[x] = b;
    }
}
