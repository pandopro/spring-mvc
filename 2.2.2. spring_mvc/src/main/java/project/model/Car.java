package project.model;

public class Car {
    private String number;
    private String brand;
    private String model;

    public Car(String number, String brand, String model) {
        this.number = number;
        this.brand = brand;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return number + " " + brand + " " + model;
    }
}
