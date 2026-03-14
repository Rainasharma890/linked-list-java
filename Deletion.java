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


public class Deletion{
    public static void main(String[] args) {
       int arr[]={1, 2, 4, 5, 8};
       Node head=create(arr);
       printLL(head);
       deletionAtBegining(head);
       deletionAtEnd(head);
       deleteAtAnyPosition(head, 3);

    }

    public static  Node create(int arr[]){
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

    public static void deletionAtBegining(Node head){
        Node temp=head;
        head=head.next;
        temp.next=null;
        System.out.println();
        printLL(head);
    }
    public static Node deletionAtEnd(Node head){
        Node temp=head;
        if(head==null || head.next==null){
            return null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        System.out.println();
        //printing list
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        return head;

    }
    public static void deleteAtAnyPosition(Node head, int position){
        Node prev=null;
        Node curr=head;
        int count=1;
        while(count<=position && curr!=null){
            if(count==position){
              prev.next=curr.next;
              curr.next=null;
            }
            prev=curr;
            curr=curr.next;
            count++;
        }

        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }



    }
    

}