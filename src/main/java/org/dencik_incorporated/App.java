package org.dencik_incorporated;

import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                new File(System.getProperty("user.dir") + "\\data\\message.json"));

        String textContent = new String(fis.readAllBytes());

        JSONObject jo = new JSONObject(textContent);

        System.out.println(jo.getString("body"));

        // de transmis
    }

}
