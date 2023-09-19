// Abstract InvoiceDao class
class InvoiceDao {
public:
    virtual void save(Invoice invoice) = 0; // Pure virtual function
};

// Concrete DatabaseInvoiceDao class
class DatabaseInvoiceDao : public InvoiceDao {
public:
    void save(Invoice invoice) override {
        // Implement the save method for the database
    }
};

// Concrete FileInvoiceDao class
class FileInvoiceDao : public InvoiceDao {
public:
    void save(Invoice invoice) override {
        // Implement the save method for files
    }
};
