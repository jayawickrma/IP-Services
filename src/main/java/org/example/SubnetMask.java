package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubnetMask {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ipconfig");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("Subnet Mask")) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
