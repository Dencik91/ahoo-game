package org.dencik_incorporated;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;
import java.util.UUID;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        final int PORT = 20000;
        Socket clientSocket = new Socket("localhost", PORT);


        System.out.println("Client connected to server!");

        OutputStream os = clientSocket.getOutputStream();
        // decorate outputstream
        ObjectOutputStream oos = new ObjectOutputStream(os);

        Message message = new Message(UUID.randomUUID(), "Hello!");

        oos.writeObject(message);
        new Scanner(System.in).next();
        os.close();
        clientSocket.close();
    }
}
