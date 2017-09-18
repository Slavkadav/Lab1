package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Toy extends Product {
    protected int ageLimit;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите цену игрушки");
        super.cost = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public int getCost() {
        return super.cost;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= this.cost;
    }

}