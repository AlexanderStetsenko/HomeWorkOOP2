package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Car extends ToyGroup {
    private double cost;

    public Car(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                '}';
    }
}
