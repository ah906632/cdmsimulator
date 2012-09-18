
package User;

import View.ServerMainFrame;

/**
 *
 * @author cassianokc
 */
public class Server {
    private ServerMainFrame mf;
    public Server()
    {
       this.mf = new ServerMainFrame();
       mf.setVisible(true);
    }
    public static void main(String args[]) 
    {
        Server s = new Server();
    }
}
