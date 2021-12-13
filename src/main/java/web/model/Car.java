package web.model;

public class Car {
    private String brand;
    private String model;
    private String country;

    public Car() {
    }

    public Car(String brand, String model, String country) {
        this.brand = brand;
        this.model = model;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
