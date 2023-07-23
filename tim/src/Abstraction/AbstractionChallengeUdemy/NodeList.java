package Abstraction.AbstractionChallengeUdemy;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem root);
    boolean removeItem(ListItem root);
    void traverse(ListItem root);
}
