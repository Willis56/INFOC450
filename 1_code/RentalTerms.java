
public class RentalTerms {

    protected int rentalLength;
    protected Customer customer;
    protected double rentalTotal;

    // Constructor to initialize RentalTerms attributes
    public RentalTerms(int rentalLength, Customer customer, double rentalTotal) {
        this.rentalLength = rentalLength;
        this.customer = customer;
        this.rentalTotal = rentalTotal;
    }

    // Get method for RentalLength
    public int getrentalLength() {
        return rentalLength;
    }

    // Set method for RentalLength
    public void setRentalLength(int rentalLength) {
        this.rentalLength = rentalLength;
    }

    // Get method for Customer
    public Customer getCustomer() {
        return customer;
    }

    // Set method for Customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Get method for RentalTotal
    public double getRentalTotal() {
        return rentalTotal;
    }

    // Set method for RentalTotal
    public void setRentalTotal(double rentalTotal) {
        this.rentalTotal = rentalTotal;
    }

    // toString method
    @Override
    public String toString() {
        return "Rental Length: " + rentalLength + "\n" + customer.toString() + "\nRental Total: " + rentalTotal;
    }

}
