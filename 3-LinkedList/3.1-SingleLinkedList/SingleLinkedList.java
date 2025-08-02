public class SingleLinkedList {
    Node head;
    Node tail;
    int size;
    
    // create a single linked list
    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return node;
    }

    // intsert a new node
    public void intsertInLinkedList(int nodeValue,int loc){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            //  create new one
            createSingleLinkedList(nodeValue);
            return;
        }else if (loc==0) {
            //at begining
            node.next = head;
            head = node;
        }else if (loc>=size) {
            // at last
            node.next=null;
            tail.next=node;
            tail = node;
        }else{
            // at middle location
            Node tempNode = head;
            int index=0;
            while (index<loc-1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // traversal single linked list
    public void traversal(){
        if(head==null){
            System.out.println("SLL not exists!!");
        }else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i!=size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    //searching 
    public boolean search(int nodeValue){
        if(head!=null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("value found at "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Value not found");
        return false;
    }

    // delete the node in ssl
    public void deleteNode(int loc){
        if(head==null){
            System.out.println("no ssl exists");
        }else if(loc==0){
            head = head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }else if(loc>=size){
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if (tempNode==head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }else {
            Node tempNode = head;
            for(int i=0;i<loc-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // delete entire ssl
    public void deleteSSL(){
        head=null;
        tail=null;
        System.out.println("SSL deleted successfully");
    }
}
