package org.dencik_incorporated;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;
import java.util.UUID;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        final int PORT = 20000;
        // create socket
        Socket clientSocket = new Socket("localhost", PORT);
        System.out.println("Client connected to server!");
        // create output stream
        OutputStream os = clientSocket.getOutputStream();
        // decorate outputstream
        ObjectOutputStream oos = new ObjectOutputStream(os);
        // create file input stream from json file
        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "\\data\\message.json");
        // put all input in string
        String textContent = new String(fis.readAllBytes());
        // put string from input in json object
        JSONObject jo = new JSONObject(textContent);

        Message message = new Message(

        oos.writeObject(message);
        new Scanner(System.in).next();
        os.close();
        clientSocket.close();
    }
}
