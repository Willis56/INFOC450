
public class Customer {

    private int customerID;
    private String CustomerName;
    private String license;
    private String phone;

    // Constructors to initialize Customer attributes with AutoNumber customerID
    public Customer(String CustomerName, String license, String phone) {
        this.customerID = -1;
        this.CustomerName = CustomerName;
        this.license = license;
        this.phone = phone;
    }

    public Customer(int customerID, String customerName, String license, String phone) {
        this.customerID = customerID;
        this.CustomerName = customerName;
        this.license = license;
        this.phone = phone;
    }

    // Get method for CustomerID
    public int getCustomerID() {
        return customerID;
    }

    // Set method for CustomerID
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    // Get method for Name
    public String getName() {
        return CustomerName;
    }

    // Set method for Name
    public void setName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    // Get method for License
    public String getLicense() {
        return license;
    }

    // Set method for License
    public void setLicense(String license) {
        this.license = license;
    }

    // Get method for Phone #
    public String getPhone() {
        return phone;
    }

    // Set method for Phone #
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // toString method
    @Override
    public String toString() {
        return "ID: " + customerID + "Customer name: " + CustomerName + ", License: " + license + "Phone: " + phone;
    }
}
