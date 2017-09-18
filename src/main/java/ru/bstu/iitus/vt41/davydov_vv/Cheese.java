package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Cheese extends Lactic {
    private String cheeseType;

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