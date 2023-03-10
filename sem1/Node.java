class Node { //этот класс выполняет роль узла в дереве отношений
    protected Person p1; //здесь добавляем родителей и детей
    Relationship re;//эта переменная отвечает за отношение родитель к детям
    protected Person p2;//

    public Node(Person p1, Relationship re, Person p2) {//здесь добавляем отношение родитель к детям
        this.p1 = p1;// добавляем родителей и детей
        this.re = re;// добавляем отношение родитель к детям
        this.p2 = p2;// добавляем родителей и детей
    }


    @Override//этот метод нужен для вывода в консоль отношения родитель к детям
    
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);//выводим в консоль отношение родитель к детям
    
    }
}
