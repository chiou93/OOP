package OOP6;

public class Truck extends Transport {
    private boolean isLoaded;//это поле нужно только для класса Truck//загружен ли у нас сейчас грузовик
    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }


    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
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


    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate); //обращение к методу setValues
        this.isLoaded = isLoaded;//обратиться к this.isLoaded и установить значение из параметра
        // System.out.println("Наш второй метод"); //здесь можем указать новый функционал
    }

    @Override
    protected String getValues() {//переписывает метод из родительского класса Т
        System.out.println(super.getValues());
        return getLoaded(); //дополнительно возвращает инфо из переменной isLoaded
    }

    /*
    @Override//переписали метод setValues из класса Transport
        public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
            super.setValues(speed, weight, color, coordinate); //обращение к методу setValues
            this.isLoaded = isLoaded;//обратиться к this.isLoaded и установить значение из параметра
           // System.out.println("Наш второй метод"); //здесь можем указать новый функционал
        }
     */
    public void setLoaded(boolean loaded) { // метод принимает один boolean// { this.isLoaded = loaded; }- или в одну строку
        this.isLoaded = loaded; //и в качестве значения утанавливает loaded
    }

    public String getLoaded() { //метод будет возвращать значение поля this.isLoaded
        if(isLoaded) //(isLoaded=true)
            return  "Грузовик загружен";
        else
            return "Грузовик не загружен";
    }
}