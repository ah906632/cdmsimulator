
package User;

import Signal.DigitalSignal;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author gustavolivrare
 */
public class Client {
    private DigitalSignal digSignal;
    private FileInputStream inputFile;
    private Socket requestSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String message;
    private String server;
    private int port;
    private boolean isConnected;
    
    public Client(String server, int port)
    {       
        this.isConnected = false;
        this.server = server;
        this.port = port;
        this.out = null;
        this.message = null;
        this.requestSocket = null;
        //digSignal = new DigitalSignal();
        //inputFile = new FileInputStream((String)JOptionPane.showInputDialog("Enter a file to send."));
    }
    
    public void open(){
        try{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                            requestSocket = new Socket(server, port);
                            /*System.out.println("Conectado a " + server+ " na porta "+port);*/
                            isConnected = true;
                            out = new ObjectOutputStream(requestSocket.getOutputStream());
                            out.flush();
                            in = new ObjectInputStream(requestSocket.getInputStream());
                            do{
                                    try{
                                            message = (String)in.readObject();
                                            System.out.println("Servidor: " + message);
                                    }
                                    catch(ClassNotFoundException classNot){
                                            System.err.println("Tipo de dados recebidos nao eh suportado");
                                    }
                            }while(!message.equals("close"));
                    }
                    catch(UnknownHostException unknownHost){
                            System.err.println("Tentativa de se conectar a um servidor desconhecido");
                    }
                    catch(IOException ioException){
                            ioException.printStackTrace();
                    }
                    finally{
                            try{
                                    in.close();
                                    out.close();
                                    requestSocket.close();
                            }
                            catch(IOException ioException){
                                    ioException.printStackTrace();
                            }
                    }
                }
            }).start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean isConnected()
    {
        return this.isConnected;
    }
    
    public void sendMessage(String msg)
    {
        if(this.out == null)
            return;
        
    	try{
    		this.out.writeObject(msg);
    		this.out.flush();
    		System.out.println("Cliente: " + msg);
    	}
    	catch(IOException ioException){
    		ioException.printStackTrace();
    	}
    }
}
