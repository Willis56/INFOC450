
public class Car {

    private String Make;
    private String Model;
    private int Year;
    private int carID;
    private double dailyCost;

    // Constructor to initialize Car attributes
    public Car(String Make, String Model, int Year, int carID, double dailyCost) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.carID = carID;
        this.dailyCost = dailyCost;
    }

    // Get method for Make
    public String getMake() {
        return Make;
    }

    // set method for Make
    public void setMake(String Make) {
        this.Make = Make;
    }

    // Get method for Model
    public String getModel() {
        return Model;
    }

    // Set method for Model
    public void setModel(String Model) {
        this.Model = Model;
    }

    // Get method for Year
    public int getYear() {
        return Year;
    }

    // Set method for Year
    public void setYear(int Year) {
        this.Year = Year;
    }

    // Get method for carID
    public int getCarID() {
        return carID;
    }

    // Set method for carID
    public void setCarID(int carID) {
        this.carID = carID;
    }

    // Get method for DailyCost
    public double getDailyCost() {
        return dailyCost;
    }

    // Set method for DailyCost    
    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    @Override
    public String toString() {
        return "Car Make: " + Make + ", Model: " + Model + ", Year: " + Year + ", Car ID: " + carID;
    }
}
