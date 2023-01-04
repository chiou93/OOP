public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Car с разными типами данных для обобщений
        Car<Integer, Double> car1 = new Car<>(1, "Toyota", "Camry", 2020, 28000.0);
        Car<String, Double> car2 = new Car<>("2", "Ford", "Mustang", 2019, 35000.0);
        Car<Integer, Integer> car3 = new Car<>(3, "Hyundai", "Elantra", 2018, 22000);

        // Выводим информацию об объектах в консоль
        System.out.println("Информация о машине 1:");
        System.out.println("ID: " + car1.getId());
        System.out.println("Марка: " + car1.getMake());
        System.out.println("Модель: " + car1.getModel());
        System.out.println("Год: " + car1.getYear());
        System.out.println("Цена: " + car1.getPrice());
        System.out.println();

        System.out.println("Информация о машине 2:");
        System.out.println("ID: " + car2.getId());
        System.out.println("Марка: " + car2.getMake());
        System.out.println("Модель: " + car2.getModel());
        System.out.println("Год: " + car2.getYear());
        System.out.println("Цена: " + car2.getPrice());
        System.out.println();

        System.out.println("Информация о машине 3:");
        System.out.println("ID: " + car3.getId());
        System.out.println("Марка: " + car3.getMake());
        System.out.println("Модель: " + car3.getModel());
        System.out.println("Год: " + car3.getYear());
        System.out.println("Цена: " + car3.getPrice());
        System.out.println();
    }
}