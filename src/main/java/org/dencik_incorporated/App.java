package org.dencik_incorporated;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class App {
    public static void main( String[] args ) throws Exception {
        final String CWD = System.getProperty("user.dir");
        final String pathI = "\\data\\bill.txt";
        final String pathO = "\\data\\bill-processed.txt";
        final Double RATE = 20.0;

        System.out.println(System.getProperty("user.dir")); // from env

        File fileI = new File(CWD+pathI);
        File fileO = new File(CWD+pathO);
        if (fileI.exists()) {
            // read from sources
            InputStream is = new FileInputStream(fileI);
            byte[] content = is.readAllBytes();
            String textContent = new String(content);
            System.out.println(textContent);

            // text processing
            final String PATTERN = "(\\d+)(EUR)";
            Pattern pattern = Pattern.compile(PATTERN);
            Matcher matcher;
            do {
                matcher = pattern.matcher(textContent);
                if (!matcher.find()) {
                    break;
                }
                Double amount = Double.valueOf(matcher.group(1));
                String currency = matcher.group(2);
                Double amountMDL = amount*RATE;
                String replacement = String.format("%.2fMDL", amountMDL);

                textContent = matcher.replaceFirst(replacement);
                System.out.println(textContent);
            } while (true);

            // Write into destination file
            OutputStream os = new FileOutputStream(fileO);
            os.write(textContent.getBytes());
            os.close();
        } else {
            System.out.println("File not found!");
        }
    }
}
