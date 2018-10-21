package com.sda.programowanie1;

public interface CustomList <E> {

    public E get(int index);
    public void add (E e);
    public int size();


    public void printList();

    public void addTail(E e);
    public void find(int index);
    public void remove ();

}
