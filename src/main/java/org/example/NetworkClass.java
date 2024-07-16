package org.example;

public class NetworkClass {
    public static void main(String[] args) {
        String ipAddress = "175.157.236.246";  // Example IP address

        String[] octets = ipAddress.split("\\.");
        int firstOctet = Integer.parseInt(octets[0]);

        if (firstOctet >= 1 && firstOctet <= 126) {
            System.out.println("Class A");
        } else if (firstOctet >= 128 && firstOctet <= 191) {
            System.out.println("Class B");
        } else if (firstOctet >= 192 && firstOctet <= 223) {
            System.out.println("Class C");
        } else if (firstOctet >= 224 && firstOctet <= 239) {
            System.out.println("Class D (Multicast)");
        } else if (firstOctet >= 240 && firstOctet <= 255) {
            System.out.println("Class E (Reserved)");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
