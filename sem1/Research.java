import java.util.*;//здесь импортируем ArrayList- этот класс позволит нам создать список объектов и добавлять в него новые объекты

public class Research { //здесь создаем класс Research и в нем создаем методы spend и spendAll для поиска родственников и вывода их на экран в консоль 
    ArrayList<Node> tree; //здесь создаем список объектов Node

    public Research(Tree geoTree) { //здесь создаем конструктор Research и в нем создаем список объектов Node

        tree = geoTree.getTree();   //здесь создаем список объектов Node
    }

    public ArrayList<Person> spend(Person p, Relationship re) { //здесь создаем метод spend для поиска родственников и вывода их на экран в консоль
        ArrayList<Person> result = new ArrayList<>(); //здесь создаем список объектов Person 
        for (Node t : tree) { //здесь создаем цикл for для поиска родственников и вывода их на экран в консоль
            if (t.p2.getName() == p.getName() && t.re == re) { //здесь создаем условие для поиска родственников и вывода их на экран в консоль
                result.add(t.p1); //иначе добавляем в список объектов Person 
            }
        }
        return result;
    }
    public ArrayList<String> spendAll(Person p) {//здесь создаем метод spendAll для поиска родственников и вывода их на экран в консоль
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p2.getName() == p.getName() && t.re == Relationship.PARENT) {//если имя родителя равно имени ребенка и родственная связь равна родителю, то добавляем в список объектов Person
                result.add("Parent: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.CHILDREN) {//если имя ребенка равно имени родителя и родственная связь равна ребенку, то добавляем в список объектов Person
                result.add("Children: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.UNCLE) {//если имя дяди равно имени ребенка и родственная связь равна дяде, то добавляем в список объектов Person
                result.add("Uncles: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.AUNT) {//если имя тети равно имени ребенка и родственная связь равна тете, то добавляем в список объектов Person
                result.add("Aunts: " + t.p1);
            }
            
        }
        return result;
    }
}

