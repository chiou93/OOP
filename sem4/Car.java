public class Car<T, U> {
    // Поля класса
    private T id;
    private String make;
    private String model;
    private int year;
    private U price;

    // Конструктор
    public Car(T id, String make, String model, int year, U price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Геттеры и сеттеры
    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public U getPrice() {
        return price;
    }
    public void setPrice(U price) {
        this.price = price;
    }
}