package pl.wozniak.michal.java.maven.glasses;

import java.util.Objects;

public class Glasses {
    private String brand;
    private String model;
    private double price;

    public Glasses(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Double.compare(glasses.price, price) == 0 &&
                Objects.equals(brand, glasses.brand) &&
                Objects.equals(model, glasses.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price);
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
