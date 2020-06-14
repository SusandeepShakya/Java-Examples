import javax.security.sasl.SaslServer;

public class SingliLinkedAdd {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail = null;

    public void addStart(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            Node temp = head;
            head = newNode;
            tail.next = temp;
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding noder to the start of the list :");
        while(current != null){
            System.out.print(current.data+"");
                    current = current.next;
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        SingliLinkedAdd sList = new SingliLinkedAdd();
        sList.addStart(1);
        sList.display();
        sList.addStart(2);
        sList.display();
        sList.addStart(3);
        sList.display();
    }
}
