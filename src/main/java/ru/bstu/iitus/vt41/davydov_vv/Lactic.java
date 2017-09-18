package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Lactic extends Product {
    private double fatContent;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите стоимость молочного продукта");
        super.cost = scanner.nextInt();
        System.out.println("Введите жирность молочного продукта");
        this.fatContent = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public int getCost() {
        return super.cost;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= super.cost;
    }

}