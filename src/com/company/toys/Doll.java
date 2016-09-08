package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Doll extends ToyGroup {
    private double cost;

    public Doll(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "cost=" + cost +
                '}';
    }
}
