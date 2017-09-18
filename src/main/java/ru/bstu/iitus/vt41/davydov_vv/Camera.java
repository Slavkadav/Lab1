package ru.bstu.iitus.vt41.davydov_vv;

import java.util.Scanner;

public class Camera extends Technical {
    private int megapixels;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera camera = (Camera) o;

        return megapixels == camera.megapixels;
    }

    @Override
    public int hashCode() {
        return megapixels;
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите разрешение камеры");
        this.megapixels = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Камера " + super.manufacture;
    }
}