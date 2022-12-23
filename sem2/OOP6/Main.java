package OOP6;

//абстрактные классы и методы
public class Main {
    public static void main(String[] args) {

        //Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});// создали объект bmw на основе класса Car

        //Transport transport = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});

        Truck truck = new Truck(5600, new byte[]{100, 0, 100}, false); // // создали объект tuck на основе класса Truck
        truck.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0}, true);//обратились к методу в к.-наследнике Truck через @Override
        //метод: 1.принял 4 параметра; 2.эти 4 параметра передал в родительский класс/метод; 3.выволнил доп.функционал - вывел
        System.out.println(truck.getValues()); //вызов из класса Truck
    }
}
