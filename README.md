# InvoiceLite

A simple Java console application for creating basic invoices.

## Features
- Enter customer name
- Add multiple invoice items
- Calculate item totals
- Calculate subtotal
- Calculate tax
- Display a clean invoice
- Uses basic Java concepts

## Java Concepts Practiced
- Classes and objects
- ArrayList
- Methods
- Loops
- Scanner input
- Encapsulation
- Basic calculations
- Formatted console output

## Project Structure

```text
InvoiceLite/
├── src/
│   └── com/
│       └── invoicelite/
│           ├── InvoiceItem.java
│           ├── Invoice.java
│           └── Main.java
├── .gitignore
└── README.md
```

## How to Run

### Using IntelliJ IDEA or Eclipse
Open the `InvoiceLite` folder as a Java project and run:

`Main.java`

### Using Terminal

From the project folder:

```bash
javac -d out src/com/invoicelite/*.java
java -cp out com.invoicelite.Main
```

## Example

```text
========================================
             INVOICE LITE
========================================
Customer: John Smith

Item                Qty      Price    Total
--------------------------------------------
Notebook              2      $5.00   $10.00
Pen                   3      $2.00    $6.00
--------------------------------------------
Subtotal:                      $16.00
Tax (8%):                       $1.28
Grand Total:                   $17.28
========================================

Thank you!
```

## GitHub

This project is intentionally simple and is ready to upload directly to GitHub.
