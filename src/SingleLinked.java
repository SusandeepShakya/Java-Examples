public class SingleLinked {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteFromStart(){
        if(head == null){
            System.out.println("List empty");
            return;
        }else{
            if(head != tail){
                head=head.next;
            }else{
                head = tail= null;
            }
        }
    }
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }else{
            if(head != tail){
                Node current = head;
                while (current.next != tail){
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }else{
                head = tail = null;
            }
        }
    }
    public void display(){
        Node current = head;
         if(head == null){
             System.out.print("List is empty");
             return;
         }
         System.out.println("Nodes of singly linked list");
         while(current != null){
             System.out.print(current.data + "");
             current = current.next;
        }
         System.out.println();
    }
    public static void main(String[] args){
       SingleLinked sList = new SingleLinked();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        while (sList.head!=null){
           sList.deleteFromStart();
           sList.deleteFromEnd();
           System.out.println("updated List");
            sList.display();

        }
    }
}
