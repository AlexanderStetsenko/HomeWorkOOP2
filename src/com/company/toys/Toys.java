package com.company.toys;

/**
 * Created by St on 03.09.2016.
 */
public class Toys {

    private double costValue;
    private ToyType type;
    private ToyGroup group;




    public Toys(ToyType type, ToyGroup group)
    {

        this.type = type;
        this.group = group;

    }



    @Override
    public String toString() {
        return "Toys{" +
                "costValue=" + type  +
                ", type=" + type +
                ", group=" + group +
                '}';
    }

    public static ToyType[] getToyTypeList()// Тип имеет свою цену, а цена игрушки формируется из Type.cost + Group.cost
    {
        ToyType[] toyTypeList = new ToyType[3];
        toyTypeList[0] = new Small(1.15);
        toyTypeList[1] = new Mid(3.25);
        toyTypeList[2] = new Big(5.25);
        return toyTypeList;
    }

    public static  ToyGroup[] getToyGroupList()// Группа имеет свою цену, а цена игрушки формируется из Type.cost + Group.cost
    {
        ToyGroup[] toyGroupList = new ToyGroup[3];
        toyGroupList[0] = new Ball(1.15);
        toyGroupList[1] = new Doll(7.25);
        toyGroupList[2] = new Car(3.25);
        return toyGroupList;
    }




}
