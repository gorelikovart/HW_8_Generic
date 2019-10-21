package com.company;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        Box<Integer> box1 = new Box<Integer>(25);
        Box<String> box2 = new Box<String>("Hello");
        box1.showObjectType();
        box1.displayInfo();
        box2.displayInfo();

    }
    public static class Box<T>
    {
        private T object;
        Box(T object) {
            this.object = object;
        }
        public T getObject() { return object; }
        public T setObject() { return object; }
        public T nullObject() { object=null; return object; } //Удалить из коробки
        void displayInfo(){
            System.out.println(object);
        }
        void showObjectType() {
            System.out.println("Тип T: " + object.getClass().getName()); //Показывает тип объекта
        }
    }

}
