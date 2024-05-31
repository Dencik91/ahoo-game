package org.dencik_incorporated;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        final int PORT = 20000;
        Socket clientSocket = new Socket("localhost", PORT);

        System.out.println("Client connected to server!");

        OutputStream os = clientSocket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        os.write(message.getBytes());
        os.close();
        clientSocket.close();
    }
}
