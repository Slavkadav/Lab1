package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Tv extends Technical {
    private int screenSize;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите диагональ экрана");
        this.screenSize = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Телевизор " + super.manufacture + " c диагональю " + this.screenSize;
    }
}