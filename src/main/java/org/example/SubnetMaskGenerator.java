package org.example;

import java.util.Scanner;

public class SubnetMaskGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter the subnet mask length (e.g., 24 for 255.255.255.0): ");
        int subnetMaskLength = scanner.nextInt();


        String subnetMask = generateSubnetMask(subnetMaskLength);  // Generate the subnet mask
        System.out.println("Subnet Mask: " + subnetMask);
    }

    public static String generateSubnetMask(int subnetMaskLength) {

        StringBuilder binarySubnetMask = new StringBuilder();


        for (int i = 0; i < subnetMaskLength; i++) {  // subnet length ekt 1 add krnw
            binarySubnetMask.append("1");
        }


        for (int i = subnetMaskLength; i < 32; i++) {  //ithuru ewata 0 add kranawa
            binarySubnetMask.append("0");
        }


        StringBuilder subnetMask = new StringBuilder();  //convert to dotted decimal
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
