class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class ArrayToLL{
    public static Node convert(int arr[]){
      Node head=new Node(arr[0]);
      Node temp=head;
      for(int i=1;i<arr.length;i++){
        Node newNode=new Node(arr[i]);
        temp.next=newNode;
        temp=newNode;

      }
      return head;
    }
    public static void main(String args[]){
       int arr[]={2, 5, 6, 8};
       Node head=convert(arr);
       System.out.print(head.data);
    }
}