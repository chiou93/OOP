package OOP6;

public class Car extends Transport {
    public Car(float _speed, int _weight, String _color, byte[] _coordinate) { //(конструктор по умолчанию)метод для установки значений объекта. называется также как и класс

        super(_speed, _weight, _color, _coordinate);//к
        System.out.println(getValues());//когда прописываем super и передаем 4 параметра (), то мы передаем эти параметры в конструктор, в классе Transport
    }

    @Override//переписываем метод moveObject
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }

    @Override
    public boolean stoopObject() {
        this.speed = 0;
        return true;
    }
}