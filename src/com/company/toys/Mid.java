package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Mid extends ToyType
{
    double cost;

    public Mid(double cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Mid{" +
                "cost=" + cost +
                '}';
    }
}
