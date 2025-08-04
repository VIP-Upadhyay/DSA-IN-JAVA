public class Main {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createSingleLinkedList(0);

        singleLinkedList.intsertInLinkedList(6, 1);
        singleLinkedList.intsertInLinkedList(7, 3);
        singleLinkedList.intsertInLinkedList(8, 4);
        singleLinkedList.intsertInLinkedList(9, 5);
        singleLinkedList.intsertInLinkedList(10, 0);
        singleLinkedList.traversal();
        singleLinkedList.search(6);
        singleLinkedList.search(20);
        singleLinkedList.deleteNode(0);
        singleLinkedList.deleteNode(5);
        singleLinkedList.deleteNode(3);
        singleLinkedList.traversal();
        singleLinkedList.deleteSSL();
        singleLinkedList.traversal();
        System.err.println("hello world");
    }
}