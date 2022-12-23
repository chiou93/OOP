package OOP9;

public abstract class Transport {

    protected float speed; //public переменные доступны в других файлах
    private int weight; // вес//теперь можно установить private, но в Main нельзя будет обратиться к объекту, например bmw.color
    private String color; //цвет
    private byte[] coordinate; //массив координат, где находится машина

    public Transport() {} //конструктор по умолчанию, чтобы не было ошибки в Car, чтобы совпадали


    public Transport(float _speed, int _weight, String _color, byte[] _coordinate) { //(конструктор по умолчанию)метод для установки значений объекта. называется также как и класс
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
    }

    public Transport(int weight, byte[] coordinate) { //можно создать сколько угодно конструкторов, главное, чтобы они отличались по кол-ву параметров или типа данных
        this.weight = weight;//обращаемся к этому полю и вытягиваем этот объект
        this.coordinate = coordinate;
        //System.out.println(this.getValues());//this. можно ипользовать для методов - обращаемся к этому классу и из этого класса вытягиваем метод getValues
    }

    public abstract void moveObject(float speed);
    public abstract boolean stoopObject();

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {//установка значений. метод ничего не возвращает. получение 4 параметра
        this.speed = speed;
        this.weight = weight; //.this - обращение к полям класса = значение из параметров ()
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() { //метод возвращает строку
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";//здесь записаны поля, которые не являются массивом
        String infoCoordinates = "Coordinates:\n"; //создаем строку String infoCoordinates
        for(int i=0; i<coordinate.length; i++) { //перебираем массив коррдинаты
            infoCoordinates += coordinate[i] + "\n"; //обращаемся к строке infoCoordinates добавляем каждый элемент из массива, вконце делаем перевод на новую строку
        }
        return info + infoCoordinates;
    }

    class Engine { //вложенный класс Engine, принадлежит к классу Transport. на основе этого класса можем создавать объекты - в Car и в Truck
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) { //будем вызывать метод и передавать значения //public Engine(boolean isReady, int km) - конструктор
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) { //через этот метод мы можем обращаться к полю private boolean isReady; - class Engine
            this.isReady = isReady;
        }

        public void info() {
            if (isReady)
                System.out.println("Двигатель исправен.");
            else
                System.out.println("Двигатель не работает. Он проехал: " + km + "km");
        }
    }
}