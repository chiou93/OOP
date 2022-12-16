import java.util.*;

public class Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }

    public void appendParentChildren(Person p1, Person p2, Person man4) { //здесь добавляем родителей и детей
        tree.add(new Node(p1, Relationship.PARENT, p2));//здесь добавляем отношение родитель к детям
        tree.add(new Node(p2, Relationship.CHILDREN, p1));//здесь добавляем отношение дети к родителям
    }

    public void appendUncleAunt(Person man2, Person man5) {//здеьс добавляем дядю и тетю
        tree.add(new Node(man2, Relationship.UNCLE, man5));//здесь добавляем отношение дядя к тетям
        tree.add(new Node(man5, Relationship.AUNT, man2));//p2, Relationship.AUNT, p1));//здесь добавляем отношение тетя к дядям
    }

    public void appendChildrenUncle(Person p1, Person p2) {//здесь добавляем детей и дядю
        tree.add(new Node(p1, Relationship.PARENT, p2));//здесь добавляем отношение родитель к детям
        tree.add(new Node(p2, Relationship.CHILDREN, p1));//здесь добавляем отношение дети к родителям
    }

    public void appendChildrenAunt(Person p1, Person p2, Person man5) {//здесь добавляем детей и тетю
        tree.add(new Node(p1, Relationship.PARENT, p2));//здесь добавляем отношение родитель к детям
        tree.add(new Node(p2, Relationship.CHILDREN, p1));//здесь добавляем отношение дети к родителям
    }

    public void appendChildrenAunt(Person man3, Person man5) {
        tree.add(new Node(man3, Relationship.AUNT, man5));//здесь добавляем отношение родитель к детям
        
    }
    
}