package linkedList;

public class MainMethod {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(50);
        list.insert(51);
        list.insert(52);
        list.insertAtStart(100);
        list.insertAtSpecific(0,15);
        list.print();
    }
}
