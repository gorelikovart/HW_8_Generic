/**
 * 26.10.2019.
 *
 * Gorelikov Artem.
 */
package com.company;

/** класс Main.
 *
 * 26.10.2019.
 *
 * Gorelikov Artem.
 */
public class Main {

    public static void main(String[] args) {
        final int x = 25;
        Box<Integer> box1 = new Box<Integer>(x);
        Box<String> box2 = new Box<String>("Hello");
        box1.showObjectType();
        box1.displayInfo();
        box2.displayInfo();
    }

    /**
     * Класс Box-коробка , с Genericom. Можно положить разные типы.
     * @param <T> - может принмать разные значения
     * @version 26.10.2019
     * @author Artem Gorelikov
     */
    public static class Box<T> {
        private T object;
        Box(T object) {
            this.object = object;
        }
        private T getObject() {
            return object; }
        private T nullObject() {
            object = null; return object; } //Удалить из коробки
        private void displayInfo() {
            System.out.println(object);
        }
        private void showObjectType() {
            System.out.println("Тип T: " + object.getClass().getName()); //Показывает тип объекта
        }
    }
}
