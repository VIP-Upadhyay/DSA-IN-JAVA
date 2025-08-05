public class Main{
    public static void main(String[] args) {
        // System.out.println("je");
        CircularSinglyLinkedList circularLinkedList = new CircularSinglyLinkedList();
        // circularLinkedList.createCSLL(1);
        // // System.out.println(circularLinkedList.head.next.value);
        // circularLinkedList.insertCSLL(2, 0);
        // circularLinkedList.insertCSLL(3, 0);
        // circularLinkedList.insertCSLL(4, 2);
        // circularLinkedList.insertCSLL(4, 21);
        // System.out.println(circularLinkedList.size);
        // System.out.println(circularLinkedList.head.value);
        // System.out.println(circularLinkedList.head.next.value);
        // System.out.println(circularLinkedList.head.next.next.value);
        // System.out.println(circularLinkedList.head.next.next.next.value);
        circularLinkedList.insertCSLL(1, 0);
        circularLinkedList.insertCSLL(2, 1);
        circularLinkedList.insertCSLL(3, 8);
        circularLinkedList.traverse();
        circularLinkedList.search(2);
        circularLinkedList.search(12);
        circularLinkedList.search(1);
    }

    
}