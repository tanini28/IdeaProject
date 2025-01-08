package org.example;

public class Car extends Transport implements ILights {

    private boolean lights;

    // Конструктор за замовчуванням
    public Car() {
        super(); // Виклик конструктора батьківського класу
        this.lights = false; // Ініціалізація полів
        System.out.println("Car object is created");
    }

    // Конструктор з параметрами
    public Car(int speed, int weight, String color, String coordinates) {
        super(speed, weight, color, coordinates); // Припускаючи, що Transport має відповідний конструктор
        this.lights = false;
        System.out.println(getValues());
    }

    // Реалізація методів абстрактного класу Transport
    @Override
    public void moveObject() {
        System.out.println("Car is moving");
    }

    @Override
    public void moveobject() {

    }

    @Override
    public void stopObject() {
        System.out.println("Car has stopped");
    }

    // Методи для роботи з фарами
    @Override
    public void setLight(boolean state) {
        this.lights = state;
    }

    @Override
    public void lightInfo() {
        if (lights) {
            System.out.println("Lights are ON");
        } else {
            System.out.println("Lights are OFF");
        }
    }
}

