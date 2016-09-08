package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Ball extends ToyGroup
{
    double cost;

    public Ball(double cost)
    {

        this.cost =  cost;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "cost=" + cost +
                '}';
    }
}
