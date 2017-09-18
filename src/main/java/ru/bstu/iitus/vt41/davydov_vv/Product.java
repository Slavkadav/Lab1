package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public abstract class Product {
    protected int cost;

    /**
     * Функция инициализации
     */
    public abstract void init(Scanner scanner);

    /**
     * Получение цены товара
     *
     * @return цена товара
     */
    public abstract int getCost();

    /**
     * Возможность купить товар
     *
     * @param cost цена товара
     * @return можно ли купить товар
     */
    public abstract boolean canBuy(int cost);
}