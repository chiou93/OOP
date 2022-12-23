package OOP9;

public class Person {

    private static int count;//count не принадлежит к объекту, а принадлежит к классу в целом/  вызов через Person.count
                            //все это поле принадлежит к классу и значение сохраняется
    //public int health;//поле не статично, принадлежит к каждому обЪекту по отдельности, поэтому static метод не будет работать с ним
    public Person() { //при помощи этого метода можем подсчитать, сколько объектов создано на основе этого класса
        count++;
    }

    public static void getCount() {
        System.out.println("Количетсво: " + count);
    }
}
