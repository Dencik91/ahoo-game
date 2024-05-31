package org.dencik_incorporated;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main( String[] args ) throws Exception {
        final int PORT = 20000;
        ServerSocket serverSocket = new ServerSocket(PORT);

        // listening
        System.out.println("Server running...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("A Client has connected");

        InputStream is = clientSocket.getInputStream();
        byte[] data = is.readAllBytes();
        String message = new String(data);
        is.close();
        clientSocket.close();

        System.out.println("Client sent: " + message);

    }
}
