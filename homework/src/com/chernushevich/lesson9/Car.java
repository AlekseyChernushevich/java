package com.chernushevich.lesson9;

public abstract class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double engineCapasity;

    public Car(String brand, String model, int year, String color, double engineCapasity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineCapasity = engineCapasity;
    }


    public Car() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void start() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getEngineCapasity() {
        return engineCapasity;
    }

}
