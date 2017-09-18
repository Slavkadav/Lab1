package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Cheese extends Lactic {
    private String cheeseType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cheese cheese = (Cheese) o;

        return cheeseType != null ? cheeseType.equals(cheese.cheeseType) : cheese.cheeseType == null;
    }

    @Override
    public int hashCode() {
        return cheeseType != null ? cheeseType.hashCode() : 0;
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите сорт сыра");
        cheeseType = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Cыр " + this.cheeseType;
    }
}