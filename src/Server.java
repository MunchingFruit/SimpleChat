import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static void run(){

        try(ServerSocket server = new ServerSocket(34522);) {
            while(true) {
                try (
                        Socket socket = server.accept();
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream());


                ) {

                    boolean connectionLive = true;
                    while(connectionLive == true){

                        String msg = input.readUTF();
                        System.out.println(msg);

                    }

                }
            }

                } catch (IOException e) {
                    System.out.println("IO EXPECTION HAHA");
                }
        }





    public static void main(String[] args) {

        run();

    }


}
