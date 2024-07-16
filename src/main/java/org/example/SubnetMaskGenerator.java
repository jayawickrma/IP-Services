package org.example;

import java.util.Scanner;

public class SubnetMaskGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter the subnet mask length (e.g., 24 for 255.255.255.0): ");
        int subnetMaskLength = scanner.nextInt();

        // Generate the subnet mask
        String subnetMask = generateSubnetMask(subnetMaskLength);
        System.out.println("Subnet Mask: " + subnetMask);
    }

    public static String generateSubnetMask(int subnetMaskLength) {
        // Initialize the subnet mask in binary form
        StringBuilder binarySubnetMask = new StringBuilder();

        // Add '1's for the subnet mask length
        for (int i = 0; i < subnetMaskLength; i++) {
            binarySubnetMask.append("1");
        }

        // Add '0's for the remaining bits
        for (int i = subnetMaskLength; i < 32; i++) {
            binarySubnetMask.append("0");
        }

        // Convert the binary subnet mask to dotted decimal notation
        StringBuilder subnetMask = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String octet = binarySubnetMask.substring(i * 8, (i + 1) * 8);
            subnetMask.append(Integer.parseInt(octet, 2));
            if (i < 3) {
                subnetMask.append(".");
            }
        }

        return subnetMask.toString();
    }
}
