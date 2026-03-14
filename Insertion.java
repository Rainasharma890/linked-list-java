class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
public class Insertion{
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        Node head=create(arr);
        printLL(head);
        insertAtBeginning(head);
        insertAtEnd(head);
        insertAtAnyPosition(head, 3);

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

    public static void insertAtBeginning(Node head){
        Node newNode=new Node(7);
        newNode.next=head;
        head=newNode;
        System.out.println();
        //Printing list after insertion
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
       

    }
    public static void insertAtEnd(Node head){
      Node newNode=new Node(29);
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;
      //printing after insertion at last
      System.out.println();
      temp=head;
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
      }
    }

    public static void insertAtAnyPosition(Node head, int position){
       Node curr=head;
       Node prev=null;
       Node newNode=new Node(100);
       int count=1;
       while(curr!=null){
        if(count==position){
            newNode.next=curr;
            prev.next=newNode;
        }
        count++;
        prev=curr;
        curr=curr.next;
       }
       System.out.println();
       //printing list
       Node temp=head;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
    }
}