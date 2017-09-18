package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Tv extends Technical {
    private int screenSize;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tv tv = (Tv) o;

        return screenSize == tv.screenSize;
    }

    @Override
    public int hashCode() {
        return screenSize;
    }

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