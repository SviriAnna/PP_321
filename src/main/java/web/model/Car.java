package web.model;

public class Car {
    private String brand;
    private int mileage;
    private int tankVolume;

    public Car() {
    }

    public Car(String brand, int mileage, int tankVolume) {
        this.brand = brand;
        this.mileage = mileage;
        this.tankVolume = tankVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", tankVolume=" + tankVolume +
                '}';
    }
}
