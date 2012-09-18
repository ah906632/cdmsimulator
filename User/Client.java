
package User;

import Signal.DigitalSignal;
import View.ServerMainFrame;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author cassianokc
 */
public class Client implements Runnable {
    DigitalSignal digSignal;
    FileInputStream inputFile;
    public Client() throws FileNotFoundException
    {       
        digSignal = new DigitalSignal();
        inputFile = new FileInputStream((String)JOptionPane.showInputDialog("Enter a file to send."));

    }
    
    @Override
    public void run() {
        ServerMainFrame mf = new ServerMainFrame();
        mf.setVisible(true);
        while (digSignal.update(inputFile) != DigitalSignal.FILE_ENDED)
        {
            digSignal.draw(mf.getGraphics());
        }
    }
    
}
