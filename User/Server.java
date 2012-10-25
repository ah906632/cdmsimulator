package User;

import View.ServerMainFrame;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author gustavolivrare
 */
public class Server{
    private ServerMainFrame mf;
    private ServerSocket providerSocket;
    private Socket connection = null;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String message;
    private boolean isConnected;
    private int port;
    
    public Server(int port)
    {
        this.isConnected = false;
        this.port = port;
    }

    public void open(){
        try{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                            providerSocket = new ServerSocket(2012);
                            System.out.println("Aguardando conexao");
                            connection = providerSocket.accept();
                            /*System.out.println("Conexao estabelecida com:  " + connection.getInetAddress().getHostName());*/
                            out = new ObjectOutputStream(connection.getOutputStream());
                            out.flush();
                            in = new ObjectInputStream(connection.getInputStream());
                            /*sendMessage("Conectado com sucesso!");*/
                            isConnected = true;
                            do{
                                    try{
                                            message = (String)in.readObject();
                                            System.out.println("Cliente: " + message);
                                            if (message.equals("close"))
                                                    sendMessage("close");
                                    }
                                    catch(ClassNotFoundException classnot){
                                            System.err.println("Tipo de dados recebidos nao eh suportado");
                                    }
                            }while(!message.equals("close"));
                    }
                    catch(IOException ioException){
                            ioException.printStackTrace();
                    }
                    finally{
                            try{
                                    in.close();
                                    out.close();
                                    providerSocket.close();
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
    	try{
    		this.out.writeObject(msg);
    		this.out.flush();
    		System.out.println("Servidor: " + msg);
    	}
    	catch(IOException ioException){
    		ioException.printStackTrace();
    	}
    }
}