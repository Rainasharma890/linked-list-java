class Node{
    int data;
    Node prev;
    Node next;
    Node(int data, Node prev, Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }

}
public class DoublyLL{
    public static void main(String[] args) {
       int arr[]={10, 20, 30, 40, 50}; 
       Node head=createDLL(arr);
       printDLL(head);
    }
    public static Node createDLL(int arr[]){
       Node head=new Node(arr[0]);
       Node prev=head;
       for(int i=1; i<arr.length; i++){
        Node newNode=new Node(arr[i]);
        prev.next=newNode;
        newNode.prev=prev;
        prev=prev.next;
       }
       return head;

    }
    public static void printDLL(Node head){
        Node temp=head;
        while(temp!=null){
          System.out.print(temp.data+"->");
          temp=temp.next;
        }
    }
}