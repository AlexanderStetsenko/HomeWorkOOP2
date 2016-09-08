package com.company.toys;

import com.company.child.Child;

/**
 * Created by St on 03.09.2016.
 */
public class Small extends ToyType
{
    double cost;

    public Small(double cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Small{" +
                "cost=" + cost +
                '}';
    }
}
