package beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BikeBean implements Serializable {
    private String model;
    private int makeYear;
    private double price;

    public BikeBean() {
        // Default constructor
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}