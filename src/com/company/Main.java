package com.company;

import com.company.child.Child;
import com.company.toys.*;

import java.util.ArrayList;
import java.util.Timer;

public class Main {

//    Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//• Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//
//• Наследование должно применяться только тогда, когда это имеет смысл.
//
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//
//• Классы должны быть грамотно разложены по пакетам.
//
//• Консольное меню должно быть минимальным.
//
//• Для хранения параметров инициализации можно использовать файлы.



// Игровая комната.
// Подготовить игровую комнату для детей разных возрастных групп.
// Игрушек должно быть фиксированное количество в пределах выделенной суммы денег.
// Должны встречаться игрушки родственных групп: маленькие, средние и большие машины, куклы, мячи, кубики.
// Провести сортировку игрушек в комнате по одному из параметров. Найти игрушки в комнате, соответствующие заданному диапазону параметров.

    // Class kids -> Baby , Teenager, preschoolChild
    //Toys -> Small, Midle, Big;
    //     -> Dools, Balls, BigToy


    public static void main(String[] args)
    {

        for ( Toys toy : getToyList()){
        System.out.println(toy.toString());
        }
    }


    public static Toys[] getToyList()
    {
        ToyType[] toyTypeList = Toys.getToyTypeList();
        ToyGroup[] toyGroupsList = Toys.getToyGroupList();
        Toys[] toyslList = new Toys[toyTypeList.length * toyGroupsList.length];

        int count = 0;

        for (int i = 0; i < toyTypeList.length; i++)
        {
            for (int j = 0; j < toyGroupsList.length ; j++)
            {
                toyslList[count] = new Toys(toyTypeList[i], toyGroupsList[j]);
                count++;
            }
        }
        return  toyslList;
    }
}
