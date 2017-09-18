package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Technical extends Product {
    protected String manufacture;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите стоимость техники");
        super.cost = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название производителя");
        manufacture = scanner.nextLine();
    }

    @Override
    public int getCost() {
        return super.cost;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= super.cost;
    }

    @Override
    public String toString() {
        return this.manufacture;
    }
}