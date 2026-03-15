class Node{
    int data;
    Node back;
    Node next;
    Node(int data){
        this.data=data;
        this.back=null;
        this.next=null;
    }
    Node(int data, Node back, Node next){
        this.data=data;
        this.back=back;
        this.next=next;
    }
}
public class InsertionDLL{
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        Node head=create(arr);
        printDLL(head);
        head=insertAtBegining(head);
        insertAtLast(head);

    }
    public static Node create(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            newNode.back=temp;
            temp.next=newNode;
            temp=temp.next;
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
    public static Node insertAtBegining(Node head){
        Node newNode=new Node(7);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.back=newNode;
            head=newNode;
        }
        System.out.println();
        printDLL(head);
        return head;
    }
    public static void insertAtLast(Node head){
        Node newNode=new Node(100);
        if(head==null){
           head=newNode;
        }
        if(head.next==null){
            head.next=newNode;
            newNode.back=head;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.back=curr;
        System.out.println();
        printDLL(head);

    }
    public static Node insertAtAnyPosition(Node head, int position){
         Node newNode=new Node(35);
         int count=1;
         if(position==1){
            insertAtBegining(newNode);
         }
         Node prev=null;
         Node curr=head;
         count=1;

         while(count<=position && curr!=null){
           if(count==position){
              prev.next=newNode;
              newNode.back=prev;
              newNode.next=curr;
              curr.back=newNode;

           }
           prev=curr;
           curr=curr.next;
           count++;

         }
         



    }
}