package OOP9;

public class Car extends Transport implements ILights {
    private boolean isOn;
    public  Engine engine = new Engine();//создали объект для вложенного класса true, 10

    public Car(float _speed, int _weight, String _color, byte[] _coordinate) { //(конструктор по умолчанию)метод для установки значений объекта. называется также как и класс
        super(_speed, _weight, _color, _coordinate);//к
    }

    public Car() {}//конструктор по умолчанию, чтобы не передавать параметры в Main Car bmw = new Car();

    @Override//переписываем метод moveObject
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается ос скоростью: " + speed);
    }

    @Override
    public boolean stoopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;

    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}