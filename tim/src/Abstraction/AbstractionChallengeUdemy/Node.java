package Abstraction.AbstractionChallengeUdemy;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        int thisValue = (int) this.value;
        int anotherValue = (int) item.value;

        if (thisValue > anotherValue) {
            return 1;
        } else if (thisValue == anotherValue) {
            return 0;
        } else return -1;

    }
}
