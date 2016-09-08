package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Big extends ToyType
{
    double cost;

    public Big(double cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Big{" +
                "cost=" + cost +
                '}';
    }
}
