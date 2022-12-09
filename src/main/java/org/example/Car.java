package org.example;

class Car {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String model;
    private int year;
    private double price;

    public Car() {
    }

    public int haeCar(int z) {
        return z;
    }

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
}