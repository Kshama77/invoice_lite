package com.invoicelite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("        Welcome to InvoiceLite");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        Invoice invoice = new Invoice(customerName);

        System.out.print("How many items do you want to add? ");
        int itemCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= itemCount; i++) {
            System.out.println();
            System.out.println("Item " + i);

            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter price: $");
            double price = scanner.nextDouble();
            scanner.nextLine();

            InvoiceItem item = new InvoiceItem(itemName, quantity, price);
            invoice.addItem(item);
        }

        invoice.printInvoice();

        scanner.close();
    }
}
