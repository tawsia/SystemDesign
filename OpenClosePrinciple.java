// Define the Invoice class (assuming you have it defined)
class Invoice {
    // Define the properties and methods of the Invoice class here
}

// Define the InvoiceDao interface
interface InvoiceDao {
    void save(Invoice invoice);
}

// Implement the DatabaseInvoiceDao class
class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // Implement the save method for the database here
        // You can write code to save the invoice to a database
        System.out.println("Saving invoice to the database");
    }
}

// Implement the FileInvoiceDao class
class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // Implement the save method for the file system here
        // You can write code to save the invoice to a file
        System.out.println("Saving invoice to a file");
    }
}
