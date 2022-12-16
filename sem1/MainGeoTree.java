public class MainGeoTree {
    public static void main(String[] args) {
        Person man1 = new Person("Max", "Miller");//parent father
        Person man2 = new Person("Meri", "Miller");//parent mother
        Person man3 = new Person("Robert", "Miller");//children son
        Person man4 = new Person("Lili", "Miller");//children daughter
        Person man5 = new Person("Kyli", "Jenner");//uncle
        Person man6 = new Person("Rain", "Gosling");//aunt


        Tree gt = new Tree();
        gt.appendParentChildren(man1, man3, man4);// отношение между родителями и детьми, где man1 - родитель, man3 - ребенок
        gt.appendParentChildren(man2, man3, man4);// отношение между родителями и детьми
        gt.appendUncleAunt(man5, man6);//отношение между дядей и тетей
        gt.appendChildrenUncle(man3, man4);// отношение между детьми и дядей, где man3 - ребенок, man4 - ребенок а man6 - тетя
        gt.appendChildrenAunt(man3, man5);// отношение между детьми и тетей
        gt.appendChildrenAunt(man4, man5);
        gt.appendChildrenAunt(man3, man4, man5);


        System.out.println(new Research(gt).spend(man1, Relationship.CHILDREN));//здесь мы узнаем сколько у человека детей
        //System.out.println(new Research(gt).spend(man1, Relationship.CHILDREN)); // здесь мы узнаем сколько у человека дядей
        System.out.println(new Research(gt).spend(man3, Relationship.AUNT)); // здесь мы узнаем сколько у человека тетей
        //System.out.println(new Research(gt).spend(man3, Relationship.PARENT)); // здесь мы узнаем сколько у человека родителей


    }
}