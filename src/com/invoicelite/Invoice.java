package com.invoicelite;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String customerName;
    private List<InvoiceItem> items;

    private static final double TAX_RATE = 0.08;

    public Invoice(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(InvoiceItem item) {
        items.add(item);
    }

    public double calculateSubtotal() {
        double subtotal = 0;

        for (InvoiceItem item : items) {
            subtotal += item.getTotal();
        }

        return subtotal;
    }

    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }

    public void printInvoice() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("             INVOICE LITE");
        System.out.println("========================================");
        System.out.println("Customer: " + customerName);
        System.out.println();
        System.out.printf("%-20s %5s %10s %10s%n",
                "Item", "Qty", "Price", "Total");
        System.out.println("----------------------------------------");

        for (InvoiceItem item : items) {
            System.out.printf("%-20s %5d $%9.2f $%9.2f%n",
                    item.getName(),
                    item.getQuantity(),
                    item.getPrice(),
                    item.getTotal());
        }

        System.out.println("----------------------------------------");
        System.out.printf("%-30s $%9.2f%n", "Subtotal:", calculateSubtotal());
        System.out.printf("%-30s $%9.2f%n", "Tax (8%):", calculateTax());
        System.out.printf("%-30s $%9.2f%n", "Grand Total:", calculateTotal());
        System.out.println("========================================");
        System.out.println("Thank you!");
    }
}
