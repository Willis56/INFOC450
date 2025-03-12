
import java.util.ArrayList;

public class RentalSystem {

    // array lists for available and unavailable
    protected ArrayList<Car> availableCars;
    protected ArrayList<Car> unavailableCars;
    private ArrayList<Customer> customers;

    // Constructor initializes car lists
    public RentalSystem() {
        availableCars = new ArrayList<>();
        unavailableCars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    //method to add car
    public void addCar(Car car) {
        availableCars.add(car);

    }

    // method to add customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    // when customer rents a car
    // remove car from available array list using carID
    // add car to unavailable array list using carID
    public boolean rentCar(int carID) {
        for (Car car : availableCars) {
            if (car.getCarID() == carID) {
                availableCars.remove(car);
                unavailableCars.add(car);
                System.out.println("\nCar rental initiated\n");
                return true;
            }
        }
        return false;

    }

    // when customer returns a car
    // remove car from unavailable array list using carID
    // add car to available array list using carID
    public boolean returnCar(int carID) {
        for (Car car : unavailableCars) {
            if (car.getCarID() == carID) {
                unavailableCars.remove(car);
                availableCars.add(car);
                System.out.println("\nCar rental returned\n");
                return true;
            }
        }
        return false;

    }
    // Calculate rental cost

    public double calculateTotal(int carID, int rentalDays) {
        for (Car car : availableCars) {
            if (car.getCarID() == carID) {
                return car.getDailyCost() * rentalDays;
            }
        }
        return -1; // Car not found
    }

    // Display available cars
    public void displayAvailableCars() {
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }

    public void displayDailyCost(int carID, javax.swing.JTextArea jTextArea2) {
        for (Car car : availableCars) {
            if (car.getCarID() == carID) {
                jTextArea2.setText("The daily cost of Car ID " + carID + " is: $" + car.getDailyCost());
                return;
            }
        }
        jTextArea2.setText("Car ID " + carID + " is not available.");
    }
}
