package mychatapp.networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_sms.main_form;

public class MessageListener extends Thread {
    ServerSocket server;
    int port;
    String sport;
    WritableGUI gui;
    //private Object ex;
    
    public MessageListener(WritableGUI gui,int port,String sport){
        this.port=port;
        this.gui=gui;
        this.sport=sport;
        try{
            server=new ServerSocket(port);
        }
        catch(IOException ex){
            Logger.getLogger(MessageListener.class.getName());
        }
    }
    public MessageListener(){
        try{
            server = new ServerSocket(port);
        }
        catch(IOException ex){
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    @Override
    public void run(){
        Socket clientSocket;
        try{
            while((clientSocket=server.accept())!=null){
                InputStream is=clientSocket.getInputStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(is));
                String line=br.readLine();
                if(line!=null){
                    gui.write("\n"+sport+" : "+line);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
       } 
    }
}
