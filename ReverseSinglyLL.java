class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

}
public class ReverseSinglyLL{
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        Node head=create(arr);
        printLL(head);
        head=reverse(head);
    }
    public static Node create(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;

    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node post=null;
        while(curr!=null){
            post=curr.next;
            curr.next=prev;
            prev=curr;
            curr=post;
        }
        head=prev;
        System.out.println();
        printLL(head);
        return head;
        
    }
}