package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkInfo {
    public static void main(String[] args) {
        try {

            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Current IP address: " + ip.getHostAddress());
            System.out.println("Current Hostname: " + ip.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
