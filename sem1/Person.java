class Person {//этот класс выполняет роль человека в дереве отношений
    private String name;//здесь добавляем имя
    private String surName;

    public String getName() {//этот метод нужен для вывода в консоль имени 
        
        return name;//это возвращает имя в консоль
    
    }
    public String getSurName() {
        return surName;
    }
    public Person(String name) {// 
        this.name = name;//это добавляет имя в дерево отношений 
    
    }
    public Person(String name, String surName) { //этот метод нужен для добавления имени и фамилии в дерево отношений
        this.name = name;//
        this.surName = surName;
    }

    @Override//этот метод нужен для вывода в консоль имени и фамилии в дерево отношений
    public String toString() {

        return String.format("(%s %s)", this.name, this.surName);//здесь выводим в консоль имя и фамилию
    }
}