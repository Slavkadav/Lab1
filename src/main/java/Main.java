import ru.bstu.iitus.vt41.davydov_vv.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] products = {"ru.bstu.iitus.vt41.davydov_vv.RubickCube", "ru.bstu.iitus.vt41.davydov_vv.Cheese", "ru.bstu.iitus.vt41.davydov_vv.Camera", "ru.bstu.iitus.vt41.davydov_vv.Tv"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товаров");

        int productNum = scanner.nextInt();

        Product[] array = new Product[productNum];

        int type;
        try {
            int i = 0;
            while (i < productNum) {
                System.out.println("Выберите тип товара");
                System.out.println("1 - кубик Рубика");
                System.out.println("2 - сыр");
                System.out.println("3 - камера");
                System.out.println("4 - телевизор");
                type = scanner.nextInt();
                scanner.nextLine();
                if (type >= 1 && type <= 4) {
                    array[i] = (Product) Class.forName(products[type - 1]).newInstance();
                    array[i].init(scanner);
                    i++;
                } else {
                    System.out.println("Вы допустили ошибку при вводе");
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Product minPriceProduct = null;
        int minPrice = Integer.MAX_VALUE;
        for (Product prod :
                array) {
            if (prod.getCost() < minPrice) {
                minPrice = prod.getCost();
                minPriceProduct = prod;
            }
        }

        System.out.println("Самый дешевый товар это " + minPriceProduct.toString() + " за " + minPriceProduct.getCost());
    }
}