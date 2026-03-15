class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
         this.next=null;
    }
    Node(int data, Node prev, Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}
public class DeletionDLL{
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        Node head=createDLL(arr);
        head=deletionAtbeginning(head);
        deletionAtEnd(head);
        deleteAtAnyPosition(head, 2);

    }
    public static Node createDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            newNode.prev=temp;
            temp.next=newNode;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        return head;

    }
    public static Node deletionAtbeginning(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;

        //printing LL after removing head
        System.out.println();
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        return head;


       
    }  
    public static void deletionAtEnd(Node head){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
            
            }
            Node pre=tail.prev;
            tail.prev=null;
            pre.next=null;
        Node temp=head;
        System.out.println();
        while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
        }

    public static void deleteAtAnyPosition(Node head, int position){
        Node curr=head;
        int count=1;
        while(count<=position && curr!=null){
            if(count==position){
                curr.prev.next=curr.next;
                curr.next.prev=curr.prev;
                curr.prev=null;
                curr.next=null;
                break;
            }
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
     


     





