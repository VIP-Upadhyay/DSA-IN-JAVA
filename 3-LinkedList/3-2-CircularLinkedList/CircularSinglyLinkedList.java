public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

    // create
    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value=nodeValue;
        node.next=node;
        head = node;
        tail = node;
        size=1;
        return node;
    }

    //insert
    public void insertCSLL(int nodeValue, int loc){
        Node node = new Node();
        node.value=nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }if(loc==0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if(loc>=size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }else{
            Node tempNode = head;
            for(int i=0;i<loc-1;i++){
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    //traverse
    public void traverse(){
        if(head!=null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }else{
            System.out.println("csll is not exists");
        }
    }

    public void search(int value){
        if(head!=null){
            Node tempNode = head;
            for(int i =0;i<size;i++){
                if(tempNode.value==value){
                    System.out.println("Value found at "+i);
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("not found");
        }else{
            System.out.println("CSLL is not exists");
        }
    }
}
