package org.dencik_incorporated;

import java.io.*;

public class App {
    public static void main( String[] args ) throws Exception {
        final String CWD = System.getProperty("user.dir");
        final String pathI = "\\data\\bill.txt";
        final String pathO = "\\data\\bill-processed.txt";

        System.out.println(System.getProperty("user.dir")); // from env

        File fileI = new File(CWD+pathI);
        File fileO = new File(CWD+pathO);
        if (fileI.exists()) {
            // read from sources
            InputStream is = new FileInputStream(fileI);
            byte[] content = is.readAllBytes();
            String textContent = new String(content);
            System.out.println(textContent);

            // Write into destination file
            OutputStream os = new FileOutputStream(fileO);
            os.write(textContent.getBytes());
            os.close();
        } else {
            System.out.println("File not found!");
        }
    }
}
