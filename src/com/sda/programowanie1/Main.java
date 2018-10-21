package com.sda.programowanie1;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomList<String> customList = new CustomLinkedList<>();
        customList.addTail("Jeden");
        customList.addTail("Dwa");
        customList.addTail("Trzy");
        customList.addTail("Cztery");
        customList.addTail("Piec");
        customList.addTail("Szesc");

        customList.printList();
        customList.find(3);

        List<String> list = new LinkedList<>();  //todo tworzenie LinkedList

        // ArrayList - implementacja tablicowa
        // LinkedList - implementacja powjazana

        //Linked  jest szybsza

        list.add ("Jan"); //todo dodawanie do LinkedList
        list.add ("Marcin");
        list.add ("Adam");


        for (String l : list){     //todo
            System.out.println(l);
        }



    }
}
