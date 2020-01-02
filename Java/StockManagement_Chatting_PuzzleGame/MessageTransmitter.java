package mychatapp.networking;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageTransmitter extends Thread {
    
    String Message,hostname;
    int port;
    public MessageTransmitter(){
        
    }
    public MessageTransmitter(String Message,String hostname,int port){
        this.Message=Message;
        this.hostname=hostname;
        this.port=port;  
    }
    public void run(){
        try{ 
            Socket s=new Socket(hostname,port);
            s.getOutputStream().write(Message.getBytes());
            s.close();
        }
        catch(IOException ex){
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
